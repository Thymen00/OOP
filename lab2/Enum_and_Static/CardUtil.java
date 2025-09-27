package lab2.Enum_and_Static;

public class CardUtil {
    private Card.Rank HIGHEST_RANK;
    private Card.Suit HIGHEST_SUIT;
    public CardUtil(){
        this.HIGHEST_RANK=Card.Rank.ACE;
        this.HIGHEST_SUIT=Card.Suit.SPADES;
    }
    public CardUtil(Card.Rank HIGHEST_RANK, Card.Suit HIGHEST_SUIT ){
        this.HIGHEST_RANK=HIGHEST_RANK;
        this.HIGHEST_SUIT=HIGHEST_SUIT;
    }

    public boolean isHighestCard(Card r){
        return r.getRank() ==  HIGHEST_RANK && r.getSuit() ==  HIGHEST_SUIT;
    }
}
