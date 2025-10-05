package lab3.ModifyClub;

import lab2.Club.MarketingClub;
import lab2.Club.SportsClub;

public class ClubTest {
    
    public static void main(String[] args){

        SportsClub sportclub = new SportsClub("Football Club", 10);
        System.out.println("SportsClub budget " + sportclub.determineBudget());
        sportclub.changeName("New name");
        System.out.println("Sportsclub name after change: " + sportclub.getName());

        MarketingClub marketingclub = new MarketingClub("Marketing Club", 5, 500);
        System.out.println("MarketingClub budget " + marketingclub.determineBudget());

        boolean used = marketingclub.useBudget(200);
        System.out.println("Use budget 200: " + used);

        used = marketingclub.useBudget(400);
        System.out.println("Use budget 400 " + used);

        System.out.println("MarketingClub budget after use: " + marketingclub.determineBudget());
    }
}
