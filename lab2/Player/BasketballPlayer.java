package lab2.Player;

public class BasketballPlayer extends Player{
    public BasketballPlayer(String name, int jerseyNumber) {
        super(name, jerseyNumber);
    }
    public void playGame() {
        playGame(48);
    }
    public void changeJerseyNumber(int newNumber){
        setJerseyNumber(newNumber);
    }
    
    
    }

