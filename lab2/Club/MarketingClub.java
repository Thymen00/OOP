package lab2.Club;

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
    }//roept de parentversie op
    //add something to the parents behavior, instead of rewriting just say if budget is not too high, use the clubs normal method.
    
}
