package lab3.ModifyClub;

public class MarketingClub extends Club {
    private int budget;

    public MarketingClub (String clubName, int minNumMember, int budget){
            super(clubName, minNumMember);
            this.budget=budget;
    }

    public boolean useBudget(int amount){
        if(budget - amount >= 0) {
            budget -= amount;
            return true;
        } 
        else{
            return false;
        } 
    }

    @Override
    public int determineBudget(){
        if(budget >1000) {
            return 0;
        }else {
            return super.determineBudget(); 
        }
    }
}
