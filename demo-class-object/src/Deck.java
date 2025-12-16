public class Deck {
  // static
  // public static char ACE = 'A';
  // public static char TWO = 'B';
  public static char[] RANKS = new char[] //
  {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
  public static int[] RANK_R = new int[] //
  {13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};//
  public static char[] SUITS = new char[] //
  {'D', 'C', 'H', 'S'};
  public static int[] SUIT_R = new int[] {1, 2, 3, 4};

  // Attribute
  private Card[] cards;

  // control a deck has 52 cards ONLY.
  public Deck() {
    this.cards = new Card[RANKS.length * SUITS.length];
    int idx = 0;
    int i = 0;
    int j = 0;
    for (char suit : SUITS) {
      i = 0;
      for (char rank : RANKS) {
        int suitR = SUIT_R[j];
        int rankR = RANK_R[i];
        this.cards[idx++] = new Card(rank, suit, rankR, suitR);
        i++;
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
