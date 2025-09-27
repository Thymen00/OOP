package lab2.Player;

public class Player {
    private String name;
    private int jerseyNumber;
    private int minutesPlayed;
    public Player(String n, int j) {
        name = n;
        jerseyNumber = j;
        minutesPlayed = 0;
    }
    public void print() {
        System.out.println(name+ " : " +jerseyNumber);
    }
    public int getMinutesPlayed() {
        return minutesPlayed;
    }
    public void playGame(int minutes) {
        this.minutesPlayed += minutes;
    }
    public void setJerseyNumber(int newNumber) {
        this.jerseyNumber = newNumber;
        System.out.println(name+ " changes number to " +jerseyNumber);
    }




    }

