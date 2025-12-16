public class Candy {
  private String color; //"Red" " Yellow" "Blue"

  private Candy(String color){
    this.color = color;
  }
    
  

  public static Candy ofRed(){
    return new Candy("Red");
  }

  public static Candy ofYellow(){
    return new Candy("Yellow");
  }

  public static Candy ofBlue(){
    return new Candy("Blue");
  }

  public String getColor(){
    return this.color;
  }


}
