public class ShapeArea {
    static final double PHI = 3.14;
    public static double getSquareArea(double side) {
        return side * side;
    }
    public static double getRectangleArea(double length, double width) {
        return length * width;
    }
    public static double getCircleArea(double radius) {
        return PHI * radius * radius;
    }
    public static double getTrapezoidArea(double base1, double base2, double height) {
        return (base1 + base2) * height / 2;
    }
}