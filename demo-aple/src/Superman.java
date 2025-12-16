public class Superman extends Human implements Flyable {
  // compile time confimed the object can fly

  public Superman(String name){
    super(name);
  }

  @Override
  public void fly() {
    
  }
   
}