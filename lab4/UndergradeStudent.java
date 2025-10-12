package lab4;

public class UndergradeStudent extends PSUStudent{
    private int currentYear;

    public UndergradeStudent(int age, double gpa){
        super(age, gpa);
        this.currentYear = 1;
    }
    public int getCurrentYear(){
        return currentYear;
    }
    public void setCurrentYear(int currentYear){
        this.currentYear = currentYear;
    }

    @Override
    public double revealGrade() {
        return(currentYear>=4) ? getGpa(): 0.0;
    }
}
