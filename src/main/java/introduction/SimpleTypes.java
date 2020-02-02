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
        String isPaidTxt = isPaid ? "tak" : "nie";
        System.out.println("Czy zapłacono rachunek? " + isPaidTxt);
        isPaid = true;
       isPaidTxt = isPaid ? "tak" : "nie";
        System.out.println("A może teraz zapłacono? " + isPaidTxt);

        int index = 0;
        String name = "Tomasz";
        char letter = name.charAt(index);
        System.out.println((index + 1) + " literka w imieniu: " + name + " to " + letter);

        String prefix = "To";
        boolean isStartingWith = name.startsWith(prefix);
        System.out.println("Czy imię " + name + " zaczyna się od " + prefix + "? : " + isStartingWith);
    }
}
