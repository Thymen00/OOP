package lab1;

public class AccountListTest {
    public static void main (String [] args){
        AccountList al = new AccountList(3);

        //voeg accounts toe
        boolean success = al.appendAccount(new Account("Thymen", 1.0));
        System.out.println("Append success: " + success);

        success = al.appendAccount(new Account("Two", 0.1));
        System.out.println("Append succes " + success);

        //probeer buiten range te halen
        Account account = al.getAccount(2); //nog geen derde account moet een foutmelding geven
        System.out.println(account);

        //geldig ophalen
        account = al.getAccount(1);
        System.out.println("Balance of account[1]: "  + account.getBalance());

        //lijst vol maken
        success = al.appendAccount(new Account("tmp", 0));
        System.out.println("Append succes: " + success);

        //lijst is nu vol dit moet weer false worden
        success = al.appendAccount(new Account("tmp2", 0));
        System.out.println("Append succes (should be false): " + success);
    }
}
