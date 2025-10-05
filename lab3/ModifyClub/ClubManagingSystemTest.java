package lab3.ModifyClub;

public class ClubManagingSystemTest {
    public static void main (String [] args){
        Club[] clubs = new Club[4];

    clubs[0] = new Club("Student", 10);
    clubs[0].addMember(190);
    clubs[1] = new SportsClub("Football", 22);
    clubs[1].addMember(18);
    clubs[2] = new ESportsClub("eFootball", 2);
    clubs[3] = new MarketingClub("Advertising", 2,100);
    clubs[3].addMember(8);

    ClubManagingSystem cms = new ClubManagingSystem(clubs);
    System.out.println("Total members: " + cms.getAllMembers());
    System.out.println("Total budget: " + cms.determineAllBudget());
    System.out.println("Highest club member: " + cms.getHighestMemberClub().getName());

    }
    
}
