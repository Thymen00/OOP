package lab1.Account;

public class AccountList {
    private Account accounts[];

    public AccountList(int maxSize){
        this.accounts = new Account[maxSize];
    }

    public boolean appendAccount(Account account){// stel het is een doos, je gaat door alle vakjes en waar ruimte is stop je een -account- in en geef je true
        for (int i=0;i<accounts.length;i++){
            if (accounts[i]==null){
            accounts[i] = account;
            return true;
            }        
        } 

        System.out.println("No space to add a new account");// als de doos vol zit geef je fout
        return false;
    }

    public Account getAccount(int idx){             // als idx (indexnummer) binn de doos valt krijg je account of null terug (als het vakje leeg is)
        if (idx < accounts.length){
            return accounts[idx];
        } else {
            System.out.println("input index exceeds the number of appended elements"); // als idx buiten de doos valt krijg je null
            return null;
        }
    }
}

