package lab1;

public class Employee {
    private String first_name;
    private String last_name;
    private double monthlySalary;

    public Employee(String first_name, String last_name, double monthlySalary){ // 3 input arguments 
        this.first_name=first_name;
        this.last_name=last_name;
        this.monthlySalary=monthlySalary;
    }
    public Employee(String first_name, String last_name){ // 2 input arguments
        this.first_name=first_name;
        this.last_name=last_name;
        this.monthlySalary=0; //je wilt geen salaris opgeven
    }

    public String getfirst_name(){
        return this.first_name; // leesbaar
    }
    public String getlast_name(){
        return this.last_name; // leesbaar
    }
    public double getmonthlySalary(){
        return this.monthlySalary; // leesbaar
    }

    public void setfirst_name(String first_name){
        this.first_name=first_name; //updatebaar
    }
    public void setlast_name(String last_name){
        this.last_name=last_name; //updatebaar
    }
    public void setMonthlySalary(double salary) { // alleen uitgevoerd als het salaris hoger is dan 0 zodat het salaris niet negatief kan zijn
        if(salary>0){
            this.monthlySalary=salary;
        }
    }
    public double getYearlySalary(){ // bereken en retouneer monthlysalary keer 12
        return this.monthlySalary*12;
    }
    public void raiseSalary(){
        this.monthlySalary=(this.monthlySalary + (this.monthlySalary*0.1));
        // if (percentage > 0) {
        //     this.monthlySalary += this.monthlySalary*(percentage/100); //eerst wordt gekeken of het percentage geen negatief getal is en dus groter is dan 0, daarna wordt het monthlysalary verhoogd door monthlysalary*(p/100)
        // }
    }




    }



























