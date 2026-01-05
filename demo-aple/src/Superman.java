public class Superman extends Human implements Flyable {
  // compile time confimed the object can fly

  private static final int FLY_SPEED;
  private static final Superman s1;

  // Static Block
  static {
    System.out.println("Block...");
    FLY_SPEED = 100;
    s1 = new Superman("Ben");
    System.out.println(s1);
    
  }

  public Superman(String name) {
    super(name);
  }

  @Override
  public void fly() {

  }
  public static void main(String[] args) {
    
  }

}
