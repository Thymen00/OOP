package lab1;

public class EmployeeTest {
    public static void main (String [] args){
        Employee employee1 = new Employee("Thymen", "Fegel", 1234);
        System.out.println("Name: " + employee1.getfirst_name() + " " + employee1.getlast_name() + ", monthly salary: " + employee1.getmonthlySalary());                                                      
        employee1.raiseSalary();                                                                                                                               
        System.out.println(employee1.getfirst_name() + ", yearly salary with 10% raise: " + employee1.getYearlySalary());
        
        Employee employee2 = new Employee("Li", "Vova", 4321);
        System.out.println("Name: " + employee2.getfirst_name() + " " + employee2.getlast_name() + ", monthly salary: " + employee2.getmonthlySalary());
        employee2.raiseSalary();
        System.out.println(employee2.getfirst_name() + ", yearly salary with 10% raise: " + employee2.getYearlySalary());
    
    }
    
    

}
