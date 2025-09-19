package lab1;

public class EmployeeTest {
    public static void main (String [] args){
        Employee employee1 = new Employee("Thymen", "Fegel", 1234);
        System.out.println("Name: " + employee1.getfirst_name() + " " + employee1.getlast_name() + ", monthly salary: " + employee1.getmonthlySalary());                                                      // tot en met hier geldt mijn naam + salaris
        employee1.raiseSalary();                                                                                                                                //verhoogt het salaris met 10 %, de berekening wordt gehaald uit de -employee- class
        System.out.println(employee1.getfirst_name() + ", yearly salary with 10% raise: " + employee1.getYearlySalary());
        
        Employee employee2 = new Employee("Li", "Vova", 4321);
        System.out.println("Name: " + employee2.getfirst_name() + " " + employee2.getlast_name() + ", monthly salary: " + employee2.getmonthlySalary());
        employee2.raiseSalary();
        System.out.println(employee2.getfirst_name() + ", yearly salary with 10% raise: " + employee2.getYearlySalary());
    
    }
    
    

}

//create 2 employee objects

 // employee1.setfirst_name("Bobo");                                                                // vanaf hier wordt alles van employee1 geupdate
        // employee1.setlast_name("Vongvilas");
        // employee1.setMonthlySalary(3000);
        // System.out.println("Updated Employee 1: " + employee1.getfirst_name() + " " + employee1.getlast_name());
        // System.out.println("Updated monthly salary: " + employee1.getmonthlySalary());