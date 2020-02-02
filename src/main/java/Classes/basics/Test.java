package Classes.basics;

public class Test {
    public static void main(String[] args) {

        User adam = new User("Adam", "Kowalski", 36);
//        adam.name = "Adam";
//        adam.lastname = "Kowalski";
//        adam.age = 36;
        adam.introduce();


        User jozek = new User("Józek", "Nowak", 42);
        jozek.name = "Józek";
        jozek.lastname = "Nowak";
        jozek.age = 42;
        jozek.introduce();

        User cloneJozek = new User(jozek);
        cloneJozek.name = "Robert";
        cloneJozek.introduce();

        System.out.println("Józek " + jozek + "Robert " + cloneJozek );

    }

}
