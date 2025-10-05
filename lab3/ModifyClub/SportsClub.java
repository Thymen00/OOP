package lab3.ModifyClub;

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

    public int getnumMember(){
        return numMember;   
    }
}