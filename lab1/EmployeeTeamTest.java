package lab1;


public class EmployeeTeamTest{
    public static void main(String [] args){
        Employee employee = new Employee("Thymen", "Fegel", 200);
        Employee boss = new Employee("Zhaolong", "Vova", 3000);
        EmployeeTeam employeePeople = new EmployeeTeam(boss, employee);

        employeePeople.printAllEmployeeDetails();
        employeePeople.giveRaiseToAllEmployees();
        employeePeople.printAllEmployeeDetails();

    }
}





















// public class EmployeeTeamTest {


//     private Employee boss;
//     private Employee employee;

//     public  EmployeeTeamTest(Employee boss, Employee employee){
//         this.boss=boss;
//         this.employee=employee;
//     }
//     public double getEmployeesalary(){
//         return employee.getYearlySalary();
//     }

//     public double getbossSalary(){
//         return boss.getYearlySalary();
//     }

//     public void printEmployeeDetails(){
//         System.out.println("Name: " + employee.getfirst_name() + " " + employee.getlast_name() + "yearsalary: " + employee.getYearlySalary());

//     }

//     public void printAllEmployeesDetails(){
//             System.out.println("Name: " + employee.getfirst_name() + " " + employee.getlast_name() + "yearsalary: " + employee.getYearlySalary());
//             System.out.println("Name: " + boss.getfirst_name() + " " + boss.getlast_name() + "yearsalary: " + boss.getYearlySalary());
//     }
    
//     public void updateSalaryOfEmployee(String first_name, double newSalary){
//         if(newSalary>0){
//             if(employee.getfirst_name().equals(first_name)){
//                 this.employee.setMonthlySalary(newSalary);
//             }
//             if(boss.getfirst_name().equals(first_name)){
//                 this.boss.setMonthlySalary(newSalary);
//         }
//     }
// }
//     public void giveRaiseToAllEmployees(double number){
//         employee.raiseSalary(number);
//         System.out.println(employee.getmonthlySalary());
//         boss.raiseSalary(number);
//         System.out.println(boss.getmonthlySalary());
//     }}
 // Employee boss = new Employee("Thymen", "Boss", 5000);   //type is employee
        // Employee employee = new Employee("Li", "Slaaf", 100);

        // EmployeeTeam team = new EmployeeTeam(boss, employee);

        // //Test de print methodes
        // team.printAllEmployeeDetails();
        // team.printEmployeeDetails();

        // //Test salary update
        // team.updateSalaryOfEmployee("Thymen", 7000);
        // team.updateSalaryOfEmployee("Li", 1000);
        // System.out.println("Salary updated: ");
        // team.printAllEmployeeDetails();

        // //Test raise
        // team.giveRaiseToAllEmployees();
        // System.out.println("10% raise");
        // team.printAllEmployeeDetails();