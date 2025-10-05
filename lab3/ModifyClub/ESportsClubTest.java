package lab3.ModifyClub;

public class ESportsClubTest {
    public static void main(String [] args) {
        ESportsClub e = new ESportsClub("ESport", 100);

        System.out.println("Name: " + e.getName());
        System.out.println("Members: " + e.getnumMember());
        System.out.println("Budget: " + e.determineBudget());
        
        e.advertise();
        System.out.println("Determine budget: " + e.determineBudget());
        System.out.println("Get name: " + e.getName());

        Club c = new ESportsClub("Esport", 100);
        c.advertise();
        System.out.println("Determine budget: " + c.determineBudget());
        System.out.println("Get name: " + c.getName());
    }
}