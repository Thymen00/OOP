package lab4;

public class GradStudent extends PSUStudent {
    private boolean passThesis;

    public GradStudent(int age, double gpa){
        super(age, gpa);
        this.passThesis = false;
    }
    public boolean getPassThesis() {
        return passThesis;
        
    }
    public void setPassThesis(boolean passThesis){
        this.passThesis= passThesis;
    }
    @Override
    public double revealGrade(){
        return passThesis? getGpa():0.0;
    }
}
