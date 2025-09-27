package lab1.Account;

public class AccountListTest {
    public static void main (String [] args){
        AccountList al = new AccountList(3);

        //voeg accounts toe
        boolean success = al.appendAccount(new Account("Thymen", 1.0));
        System.out.println("Append success: " + success);

        success = al.appendAccount(new Account("Two", 0.1));
        System.out.println("Append succes " + success);

        
        Account account = al.getAccount(2); //je vraagt om een derde vakje maar dat is nog leef dus null
        System.out.println(account);

        //gsaldo tonen want je vraagt het tweede accout (idx 1)
        account = al.getAccount(1);
        System.out.println("Balance of account[1]: "  + account.getBalance());

        //Derde account toevoegen
        success = al.appendAccount(new Account("tmp", 0));
        System.out.println("Append succes: " + success);

        //lijst is nu vol dit moet weer false worden
        success = al.appendAccount(new Account("tmp2", 0));
        System.out.println("Append succes (should be false): " + success);
    }
}
