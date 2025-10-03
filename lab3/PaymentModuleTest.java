package lab3;

public class PaymentModuleTest {
    public static void main (String[] args){
PaymentModule payment = new PaymentModule();

        Employee full1 = new Fulltimer("Thymen", 5000);
        Employee hour1 = new Hourly("Bob", 100, 20);
        Employee man1 = new Manager("Bobo", 6000, 5);
        Employee man2 = new Manager("Thymen", 5000, 12);

        payment.payment(full1);
        payment.payment(hour1);
        payment.payment(man1);
        payment.payment(man2);

        System.out.println("Total pay: " + payment.getTotalPay());
    }
    
}
