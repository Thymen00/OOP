package lab2.Club;

public class SportsClub extends Club{

    public SportsClub(String clubName, int minNumMember){
        super(clubName, minNumMember);
    }

    @Override 
    public int determineBudget(){
        return ((numMember*1000) + (numMember-minNumMember) * 100);
    }

    @Override
    public void changeName(String newName){

    }
}
// override is een speciale marker in java wat zegt dat het de parent class methode moet overnemen/replace
//super is een manier om naar de parent class te referen, it runs the parent constructor to set up the attributes from the parent in here