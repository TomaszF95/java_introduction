package Classes.basics.exercise;

import Classes.basics.User;

public class Test {

    public static void main(String[] args) {
        Point point1 = new Point(3.0D, 1.0D);
        Point point2 = new Point(4.0D, 7.0D);





        double distance = Point.distance(point1, point2);
        System.out.println("Odleglosc miedzy punktami x i y = " + distance);

        distance = point1.distanceTo(point2);
        System.out.println("Odleglosc miedzy punktami x i y = " + distance);

        PointCollection pointCollection = new PointCollection();
        pointCollection.addPoints(point1);
        pointCollection.addPoints(point1, point2);
        pointCollection.printAllPoints();

    }


}
