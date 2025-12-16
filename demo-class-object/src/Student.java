public class Student {
  private Candy[] candies;

  public Student(){
    this.candies = new Candy[0];
  }

  public void getCandy(Candy candy){
    Candy[] candiesT = new Candy[this.candies.length+1];
    for (int i = 0 ; i < this.candies.length ; i++){
      candiesT[i] = this.candies[i];
    }
    candiesT[candiesT.length -1 ] = candy;
    this.candies = candiesT;
  }

  public Candy checkCandy(int i){
    return this.candies[i];
  }

  public Candy[] getCandiesList(){
    return this.candies;
  }
}
