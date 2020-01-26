package introduction;


public class SimpleTypes {
    public static void main(String[] args) {
        int Age;
        Age = 25;
        System.out.println("Wiek to " + Age);

        long lottoReward = 32_000_000L;
        System.out.println("Wygrana " + lottoReward);

        short dayOfMonth = 29;
        System.out.println("Dzien miesiaca: " + dayOfMonth);

        final float PI = 3.14F;
        System.out.println("Liczba pi wynosi: " + PI);

        double liczbaMieszkancowWuhan = 350_432D;
        System.out.println("Wypłata: " + liczbaMieszkancowWuhan);

        boolean isPaid = false;
        System.out.println("Czy zapłacono rachunek? " + isPaid);
        isPaid = true;
        System.out.println("A może teraz zapłacono? " + isPaid);
    }
}
