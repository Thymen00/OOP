package lab4;

public class TriangleManagerTest {
    public static void main(String[] args){
        TriangleManager manager = new TriangleManager(true);
        Triangle t1 = new EquilateralTriangle(5.0);
        Triangle t2 = new RightTriangle(3.0, 4.0, 5.0);
        Triangle t3 = new EquilateralTriangle(7.0);
        Triangle t4 = null;

        manager.addTriangle(t1);
        manager.addTriangle(t2);
        manager.addTriangle(t3);
        manager.addTriangle(t4);

        System.out.println("All Triangles: ");
        manager.displayAllTriangles();

        Triangle largest = manager.findTriangleWithLargestPerimeter();
        if (largest!=null){
            System.out.println("Trianlge with the largest perimeter: ");
            System.out.println("Longest side: " + largest.getLongestSideLength());
            System.out.println("Perimeter: " + largest.getPerimeter());
            System.out.println("Largest Angle: " + largest.getLargestAngle());
        }

    }
}
