public class Deck {
  // static
  // public static char ACE = 'A';
  // public static char TWO = 'B';

  // Attribute
  private Card[] cards;

  // control a deck has 52 cards ONLY.
  public Deck() {
    this.cards = new Card[Rank.values().length * SUITS.length];
    int idx = 0;
    int i = 0;
    int j = 0;
    for (char suit : SUITS.values()) {
      i = 0;
      for (Rank rank : Rank.values()) {
        this.cards[idx++] = new Card(rank, suit);
      }
      j++;
    }
  }


  public Card[] getCards() {
    return this.cards;
  }

  public static void main(String[] args) {
    Deck d1 = new Deck();
    int tt = 23;
    System.err.println(d1.getCards()[tt].toString());
    System.out.println(d1.getCards()[tt].getRank()); 
    System.out.println(d1.getCards()[tt].getRankR());
    System.out.println(d1.getCards()[tt].getSuit());
    System.out.println(d1.getCards()[tt].getSuitR());
  }
}
