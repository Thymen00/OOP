package lab3.ModifyClub;

public class ClubManagingSystem {
    private Club[] clubList;

    public ClubManagingSystem (Club[] c){
        this.clubList = c;
    }

    public int determineAllBudget(){
        int sum = 0;
        for(Club c : clubList){
            sum+= c.determineBudget();
        }
        return sum;
    }
    public int getAllMembers(){
        int total =0;
        for (Club c : clubList){
            total+= c.numMember;
        }
        return total;
    }
    public Club getHighestMemberClub(){
        if (clubList.length == 0) return null;
        Club Highest = clubList[0];
        for (int i=1;i<clubList.length;i++){
            if(clubList[i].numMember>Highest.numMember){
                Highest = clubList[i];
            }
        }
        return Highest;
    }

}
