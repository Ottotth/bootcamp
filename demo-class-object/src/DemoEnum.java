public class DemoEnum {

  public static void main(String[] args) {
    BallA b1 = BallA.ofRed();
    BallA b2 = BallA.ofYellow();
    BallA b3 = BallA.ofRed();
  

  if (b1.getColor() == b3.getColor()){
   System.out.println("Same Color : Red"); 
  }
}
  
}
