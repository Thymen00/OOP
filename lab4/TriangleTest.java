package lab4;

public class TriangleTest {
    public static void main(String[] args) {
        EquilateralTriangle eq = new EquilateralTriangle(5.0);
        System.out.println("Equilateral Triangle:");
        System.out.println("Longest side: " + eq.getLongestSideLength());
        System.out.println("Perimeter: " + eq.getPerimeter());
        System.out.println("Largest Angle: " + eq.getLargestAngle());
        System.out.println();

        RightTriangle rt = new RightTriangle(3.0, 4.0, 5.0);
        System.out.println("Right Triangle:");
        System.out.println("Longest side: " + rt.getLongestSideLength());
        System.out.println("Perimeter: " + rt.getPerimeter());
        System.out.println("Largest Angle: " + rt.getLargestAngle());
        System.out.println();
    }
}
