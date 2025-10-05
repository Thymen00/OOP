package lab3.ModifyClub;

public class ESportsClub extends SportsClub{
    public ESportsClub(String clubName, int numMember) {
        super(clubName, 1);
        this.numMember = numMember;
    }
    @Override
    public final void advertise(){
        System.out.println("No need to advertise");
    }
}
