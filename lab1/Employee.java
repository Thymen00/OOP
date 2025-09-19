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
        return this.first_name; 
    }
    public String getlast_name(){
        return this.last_name;
    }
    public double getmonthlySalary(){
        return this.monthlySalary; 
    }

    public void setfirst_name(String first_name){
        this.first_name=first_name; 
    }
    public void setlast_name(String last_name){
        this.last_name=last_name; 
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
        
    }




    }



























