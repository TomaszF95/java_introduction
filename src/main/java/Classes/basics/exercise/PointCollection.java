package Classes.basics.exercise;

public class PointCollection {

    Point[] points = new Point[100];
    int pointNumber = 0;

    void addPoints(Point... points) {
        for (Point newPoint: points) {
            this.points[pointNumber] = newPoint;
            pointNumber++;
        }
    }

    void printStats() {
        //wypisz najmniejszy i najwiekszy dystans miedzy punktami
        //tip: nie porownoj punktu samego z soba (if (point1 != point2))
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for(i=0 ; i<this.pointNumber ; i++ ) {

            Point point1 = points[i];
            for(i=0 ; j < this.pointNumber ; i++ ) {

                Point point2 = points[j];
                if (point1 == point2) {
                    continue;
                }
                double distance = point1.distanceTo(point2);
                if (distance < min) {
                    min = distance;
                }
                if (distance > max) {
                    max = distance;
                }


        }
            System.out.println("Maksymalna odległość: " + max + ", minimalna odległość: " + min);





    }

    void printAllPoints() {
        // wypisz wszystkie elementy tablicy this.points od 0 do (this.pointNumber - 1) uzyj petli
        int i;
        for(i=0 ; i<this.pointNumber ; i++ ) {
            System.out.println(points[i]);
        }
    }
    // tu uzylismy getterow z klasy "Point"
    void printPoint(Point point) {
        System.out.println("Point(x: " + point.getX() + " y: " + point.getY() + ")");
    }

}
