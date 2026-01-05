public class Card {
  private Rank rank; // A 2 3 4 5 6 7 8 9 T J Q K
  private char suit; // D C H S
  private int rankR;
  private int suitR;

  // constructor
  public Card(Rank rank, char suit) {
    this.rank = rank;
    this.suit = suit;

  }

  public Rank getRank() {
    return this.rank;
  }

  public char getSuit() {
    return this.suit;
  }

  public int getRankR() {
    return this.rankR;
  }

  public int getSuitR() {
    return this.suitR;
  }

  // ! No Setter

  public String toString() {
    return "Card(" //
        + "rank=" + this.rank //
        + " | RankRank=" + this.rankR//
        + " | suit=" + this.suit //
        + " | SuitRank=" + this.suitR
        + ")";
  }
}
