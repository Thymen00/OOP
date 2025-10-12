package lab4;

public abstract class PSUStudent {
    private int age;
    private double gpa;

    public PSUStudent(int age, double gpa){
        if(age<0){
            System.out.println("invalid age: Setting age to 0.");
            this.age=0;
        } else {
            this.age = age;
        }

        if(gpa<0.0||gpa>4.0){
            System.out.println("Invalid GPA: setting GPA to 0.0");
            this.gpa=0.0;
        }else {
            this.gpa=gpa;
        }
        
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        if(age<0){
            System.out.println("invalid age: Keeping previous value.");
            this.age=0;
        } else {
            this.age = age;
        }
    }

    public double getGpa() {
        return gpa;
    }
     public void setGpa(double gpa) {
         if(gpa<0.0||gpa>4.0){
            System.out.println("Invalid GPA: Keeping previous value.");
            this.gpa=0.0;
        }else {
            this.gpa=gpa;
        }
     }
     public abstract double revealGrade();
}
