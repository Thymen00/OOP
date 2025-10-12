package lab4;

import java.util.*;


public class TriangleManager {
    private List<Triangle>triangles;

    public TriangleManager(boolean useArrayList){
        if(useArrayList){
            triangles = new ArrayList<>();
            System.out.println("Triangle list created using ArrayList.");
        } else {
            triangles = new LinkedList<>();
            System.out.println("Triangle list created using LinkedList.");
        }
    }
    public void addTriangle(Triangle t) {
        if (t==null) {
            System.out.println("Error: Triangle cannot be null");

        }else {
            triangles.add(t);
            System.out.println("Traingle added succesfully.");
        }
    }
    public Triangle findTriangleWithLargestPerimeter(){
        if(triangles.isEmpty()){
            System.out.println("No triangles available in the list.");
            return null;
        }
        Triangle largest = triangles.get(0);
        for(Triangle t: triangles){
            if ( t.getPerimeter()> largest.getPerimeter()){
                largest=t;
            }
        }
        return largest;
    }

    public void displayAllTriangles(){
        if(triangles.isEmpty()){
            System.out.println("No triangles to display");
            return;
        }
        int i = 1;
        for (Triangle t:triangles){
            System.out.println("Triangle" + i + ":");
            System.out.println("Longest side: " + t.getLongestSideLength());
            System.out.println("Perimeter: " + t.getPerimeter());
            System.out.println("Largest Angle: " + t.getLargestAngle());
            System.out.println();
            i++;
        }
    }
}
