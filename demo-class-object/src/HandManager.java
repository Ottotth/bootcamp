public class HandManager {
  private Card[] cards;

  public HandManager(Card[] cards) {
    this.cards = cards;
  }

  public boolean isFlush() {
    if (this.cards.length != 5)
      return false;
    if (this.cards[0].getSuit() != this.cards[1].getSuit()
        || this.cards[1].getSuit() != this.cards[2].getSuit()
        || this.cards[2].getSuit() != this.cards[3].getSuit()
        || this.cards[3].getSuit() != this.cards[4].getSuit())
      return false;
    return true;
  }

  public boolean isFullHouse() {
    if (this.cards.length != 5)
      return false;
    int[] counts = new int[40];
    for (int i = 0; i < this.cards.length; i++) {
      counts[this.cards[i].getRank() - '2']++; // ! '2' is the smallest ASCII 
    }
    boolean withThreeCount = false;
    boolean withTwoCount = false;
    for (int i = 0; i < counts.length; i++) { // 40 times
      if (counts[i] == 3)
          withThreeCount = true;
      if (counts[i] == 2)
          withTwoCount = true;
    }
    return withThreeCount &&withTwoCount;
  }

  //Test Case deisgn
  //1. go though all retrun
  //2. for loop (break ,continue)
  //3. array

  public static void main(String[] args) {
    
  }
}
