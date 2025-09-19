package lab1;

public class EmployeeTeam {
    private Employee boss;
    private Employee employee;

    public EmployeeTeam(Employee boss, Employee employee){
        this.boss=boss;
        this.employee=employee;

    }

    public void printEmployeeDetails(){
        System.out.println("Employee: " + employee.getfirst_name() + " " + employee.getlast_name() + " Salary: " + (int)employee.getmonthlySalary());
    }
    public void printAllEmployeeDetails(){
        System.out.println("Boss: " + boss.getfirst_name() + " " + boss.getlast_name() + " Salary: " + (int)boss.getmonthlySalary());
        System.out.println("Employee: " + employee.getfirst_name() + " " + employee.getlast_name() + " Salary: " +(int) employee.getmonthlySalary());
        
    }
    public void updateSalaryOfEmployee(String first_name, double newSalary){
        if (newSalary >0){
            if (boss.getfirst_name().equals(first_name)){
                boss.setMonthlySalary(newSalary);
            } else if (employee.getfirst_name().equals(first_name)){
                employee.setMonthlySalary(newSalary);
            }
        }
    }
    public void giveRaiseToAllEmployees(){
        boss.raiseSalary();
        employee.raiseSalary();
    }
    
}

