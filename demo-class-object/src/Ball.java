public class Ball {
  private Color color;

  private Ball(Color color){
    this.color = color;
  }

  public static BallA ofRed(){
    return new BallA(Color.RED);
  }
  public static BallA ofBlue(){
    return new BallA(Color.BLUE);
  }
  public static BallA ofYellow(){
    return new BallA(Color.YELLOW);
  }

  public Color getColor(){
    return this.color;
  }
}
