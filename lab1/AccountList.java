package lab1;

public class AccountList {
    private Account accounts[];

    public AccountList(int maxSize){
        this.accounts = new Account[maxSize];
    }

    public boolean appendAccount(Account account){
        for (int i=0;i<accounts.length;i++){
            if (accounts[i]==null){
            accounts[i] = account;
            return true;
            }        
        } 

        System.out.println("No space to add a new account");
        return false;
    }

    public Account getAccount(int idx){
        if (idx < accounts.length){
            return accounts[idx];
        } else {
            System.out.println("input index exceeds the number of appended elements");
            return null;
        }
    }
}

