package loops;

public class Loops {

    public static void main(String[] args) {

        int sum = 0;
        int i = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Suma liczb od 0 do 20 to " + sum);

        i = 1;
        do {
            if (i % 2 == 0 && i % 3== 0) {
                System.out.println(i + " podzielna przez dwa i trzy");
            }
            i++;
        } while (i < 100);

    }


}
