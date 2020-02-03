package Classes.basics;

public class Test {
    public static void main(String[] args) {

        User adam = new User("Adam", "Kowalski", 17);
//        adam.name = "Adam";
//        adam.lastname = "Kowalski";
//        adam.age = 36;
        adam.introduce();


        User jozek = new User("Józek", "Nowak", 45);
        jozek.name = "Józek";
        jozek.lastname = "Nowak";
        jozek.age = 42;
        jozek.introduce();

        User cloneJozek = new User(jozek);
        cloneJozek.name = "Robert";
        cloneJozek.age = 20;
        cloneJozek.introduce();

        System.out.println("Józek " + jozek + "Robert " + cloneJozek );

        System.out.println("###### TEST WIEKU ######");
        System.out.println("Czy Adam jest dorosły? " + adam.isAdult());
        System.out.println("Czy Adam jest dorosły? " + jozek.isAdult());
        System.out.println("Czy Adam jest dorosły? " + cloneJozek.isAdult());

    }

}
