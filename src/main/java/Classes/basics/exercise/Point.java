package Classes.basics.exercise;

public class Point {

   private double x;
   private double y;

   public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Statyczna metoda
   public static double distance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
    }
    //Wywolanie metody statycznej w metodzie zwyklej
    public double distanceTo(Point other) {
        return distance(this, other);
    }

    public String toString() {
       return "Point(x: " + x + " , y: " + y + ")";
    }
    //tzw gettery jesli jakas klasa jest prywatna a mimo to chcemy zaimportowac cos do innej klasy
    public double getX() {
       return x;
    }

    public double getY() {
       return y;
    }


}
