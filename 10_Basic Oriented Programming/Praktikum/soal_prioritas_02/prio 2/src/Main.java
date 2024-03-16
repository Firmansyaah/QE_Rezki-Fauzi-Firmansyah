public class Main {
    public static void main(String[] args) {
        // Input
        double squareArea = ShapeArea.getSquareArea(12);
        double rectangleArea = ShapeArea.getRectangleArea(7, 8);
        double circleArea = ShapeArea.getCircleArea(21);
        double trapezoidArea = ShapeArea.getTrapezoidArea(5, 6, 2);

        // Output
        System.out.println("luas persegi: " + squareArea);
        System.out.println("luas persegi panjang: " + rectangleArea);
        System.out.println("luas lingkaran: " + circleArea);
        System.out.println("luas trapesium: " + trapezoidArea);
    }

}