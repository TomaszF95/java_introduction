package introduction;

public class Strings {
    public static void main(String[] args) {
        String text = "Ala ma kota";
        String text2 = "Ala ma kota";
        System.out.println("Text1: " + text + ", text 2: " + text2);

        System.out.println("Czy  obie zmienne to to samo? " + text.equals(text2));

        // zadanie 1
        StringBuilder builder = new StringBuilder();
        builder.append("Ala");
        builder.append("ma");
        builder.append("kota");
        String resultText = builder.toString();
        System.out.println("Napis utworzony przez buildera: " + builder.toString());

        //zadanie 2
        String ala = "Ala ma kota";
        System.out.println("5 litera w zdaniu ala ma kota to: " + ala.charAt(4));

        //zadanie 3
        ala = "Ala ma kota";
        System.out.println("zdanie Ala ma kota zaczyna się od" + ala.startsWith("Ala") + " A konczy sie na: " + ala.endsWith("kota"));

        //zadanie 4
        String litwa = "Litwo! ojczyzno moja!";
        System.out.println("Długość zdania to: " + litwa.length());

        //zadanie 5
        String abcd = "abcdefgh";
        System.out.println("Litera d wystepuje na miejscu: " + abcd.indexOf("d"));

        //zadanie 6
        String zad6 = "Ala ma kota, kot ma mleko";
        System.out.println(zad6.substring(7,12));

        //zadanie 7
        System.out.println(ala.contains("ALA"));

        //zadanie 8
        String ala2 = "ALA MA KOTA";
        System.out.println(ala.equals(ala2));

        //zadanie 9
        String zmiana = "Tadek";
        System.out.println(ala.replace("Ala" , "Tadek"));

        //zadanie 10
        String ala3 = " ALA MA KOTA ";
        System.out.println(ala3.trim());







    }
}
