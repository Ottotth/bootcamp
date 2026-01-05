public enum Rank {
  A(12),
  TWO(13),
  THREE(1), 
  FOUR(2), 
  FIVE(3), 
  SIX(4), 
  SEVEN(5), 
  EIGHT(6),
  NINE(7), 
  TEN(8), 
  J(9), 
  Q(10), 
  K(11),;

  private int seq;

  private Rank(int seq){
    this.seq = seq;
  }

  public int getRank(){
    return this.seq;
  }
  
}
