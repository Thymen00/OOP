package lab2.Enum_and_Static;

public class CardTest {
    public static void main(String[]args){
          Card card1 = new Card(Card.Rank.ACE, Card.Suit.SPADES);
    Card card2 = new Card(Card.Rank.QUEEN, Card.Suit.HEARTS);
    Card card3 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);

    CardUtil util = new CardUtil();
    System.out.println(card1.getRank() + " of " + card1.getSuit() + " is highest? " + util.isHighestCard(card1));
    System.out.println(card2.getRank() + " of " + card2.getSuit() + " is highest? " + util.isHighestCard(card2));
    System.out.println(card3.getRank() + " of " + card3.getSuit() + " is highest? " + util.isHighestCard(card3));

    CardUtil util2 = new CardUtil(Card.Rank.QUEEN, Card.Suit.HEARTS);
    System.out.println(card2.getRank() + " of " + card2.getSuit() + " is highest (custom)? " + util2.isHighestCard(card2));
    System.out.println(card2.getRank() + " of " + card2.getSuit() + " is highest (custom)? " + util2.isHighestCard(card1));
    }
  

   
}
