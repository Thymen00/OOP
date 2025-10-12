package lab4;

import java.util.Scanner;

public class PSUStudentTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();

        System.out.println("Creating UndergradStudent...");
        UndergradeStudent u = new UndergradeStudent(age, gpa);
        System.out.println("Age: " + u.getAge());
        System.out.println("GPA: " + u.getGpa());
        System.out.println("Revealed Grade: " + u.revealGrade());

        System.out.println("Creating gradStudent...");
        GradStudent g = new GradStudent(age, gpa);
        System.out.println("Age: " + u.getAge());
        System.out.println("GPA: " + u.getGpa());
        System.out.println("Revealed Grade: " + u.revealGrade());

        input.close();
    
    }
}
