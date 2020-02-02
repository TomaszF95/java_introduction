package arrays;

public class exercisw {
    public static void main(String[] args) {
        int [] numbers = new int [] {23, 24, 56, 65, 35, 87, 95, 32, 38};
        // znajdz max i minimalna wartosc w tablicy

        int max = Integer.MIN_VALUE;
        max = numbers[0];
        int min = Integer.MAX_VALUE;
        min = numbers[0];
        double mean = 0.0D;

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[1]){
                max = numbers[i];
            }

            if (min > numbers[i]) {
                min = numbers[i];
            }
            mean += numbers[i];
        }
        mean /= numbers.length;
        System.out.println("min: " + min + " max " + max + " mean " + mean);


        for (int elem: numbers) {
            if (elem % 3 == 0) {
                System.out.println(elem + " jest podzielny przez 3");
            }
        }
    }

















}
