package arrays;

public class exercise2 {
    public static void main(String[] args) {
        String [] names = new String [] {
                    "Ala",
                    "Ola",
                    "Andrzej",
                    "Brunhilda",
                    "Genowefa",
                    "Gniewomir",
                    "Sławomir",
                    "Mścisław",
                    "Stanisław",
                    "Bronisław",
                    "Wiercisław",
                    "Petronela",
                    "Kunegunda"


        };
        //Zadanie 1 wypisz imiona żeńskie
        //zad 2 wypisz imiona żeńskie nie dłuższe niż 3 znaki
        //zadanie 3 wypisz imiona słowiańskie (kończą się na sław lub mir
        // zad 4 znajdz najdluzsze imie
        int longestNameLength = 0;
        for (String name: names) {
            if (longestNameLength < name.length()) {
                longestNameLength = name.length();
            }
            for (String name: names) {
                if (longestNameLength == name.length()) {
                    System.out.println(name);
                }
            }
            if (name.endsWith("a")) {
                System.out.println("Żeńskie imiona to: " + name);
            }
            }




        }



    }

