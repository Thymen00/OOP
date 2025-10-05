package lab3.Payment;

public class PaymentModule {
    protected int totalPay;

    public PaymentModule(){
        this.totalPay = 0;
    }

    public void payment(Employee e){
        double pay = e.computePay();
        if(e instanceof Manager) {
            Manager m = (Manager) e;
            if (m.getWorkYear()>10){
                pay*=2;
            }
        }
        totalPay+=pay;
    }
        public double getTotalPay(){
            return totalPay;
        
    }
}
