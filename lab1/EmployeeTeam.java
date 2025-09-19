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


// public class Auto {
//     // Attributes (eigenschappen)
//     public String merk;
//     public String kleur;
//     public int deuren;

//     // private attribute (encapsulation)
//     private int kmStand;

//     // Constructor
//     public Auto(String merk, String kleur, int deuren) {
//         this.merk = merk;
//         this.kleur = kleur;
//         this.deuren = deuren;
//         this.kmStand = 0; // begin altijd op 0 km
//     }

//     // Methode om te rijden
//     public void rijden(int km) {
//         this.kmStand += km;
//         System.out.println("De auto rijdt " + km + " km.");
//     }

//     // Methode om de kilometerstand op te vragen (getter)
//     public int getKmStand() {
//         return this.kmStand;
//     }
// }
