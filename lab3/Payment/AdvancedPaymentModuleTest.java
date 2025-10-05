package lab3.Payment;

public class AdvancedPaymentModuleTest {
    public static void main(String[] args){
        AdvancedPaymentModule apm = new AdvancedPaymentModule();

        Employee[] employees = {
            new Fulltimer("Thymen", 1000),
            new Hourly("Bob", 20, 100),
            new Manager("Bobo", 6000,5),
            new Manager("Ben", 7000, 12)
        };
        apm.payment(employees);
        System.out.println("Total pay (Advanced) " + apm.getTotalPay());
    }
}
