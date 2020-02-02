package conditions;

import java.util.Scanner;

public class ConditionInstructions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Czesc jak masz na imie?");
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + "!");

        if (name.endsWith("a")) {
            System.out.println("Zgaduję, że jesteś kobietą.");
        } else {
            System.out.println("Zgaduje, że jestes mężczyzną.");
        }

            System.out.println("Ile masz lat?");
        int age = scanner.nextInt();
        String ending = "lat";
        if (age < 10 || age > 20) {
            switch (age % 10) {
                case 3:
                case 2:
                case 4:
                    ending = "lata";
                    break;
                default:
                    ending = "lat";

            }
        }
        System.out.println("Fajnie, że masz " + age + " " + ending + "!");

        if (age >= 18) {
        System.out.println("Fajnie, że jestes pełnoletni");
        } else {
            System.out.println("Jestes niepełnoletni");
        }





    }
}
