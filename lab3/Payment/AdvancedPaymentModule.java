package lab3.Payment;

public class AdvancedPaymentModule extends PaymentModule{
    public AdvancedPaymentModule(){
        super();
    }
    public void payment(Employee[] employees){
        for (Employee e : employees) {
            super.payment(e);
        }
    }
}
