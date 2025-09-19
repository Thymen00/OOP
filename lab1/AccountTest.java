package lab1;

public class AccountTest {
    public static void main (String[] args){
        //Account met een geldig saldo
        Account a1= new Account("Thymen", 100);

        //Account met een ongeldig saldo dat moet 0 zijn
        Account a2= new Account("Bob", -100);
        
        //print de initiële waardes, dus de oorspronkelijke
        System.out.println(a1.getName() + " balance: " + a1.getBalance());
        System.out.println(a2.getName() + " balance: " + a2.getBalance());

        a1.setName("Thymen goat");
        System.out.println("Updated account name: " + a1.getName());
    }
}
