// Coding pattern : singleton
public class Car {
  private int speed;
  private int name;
  private static final Car INSTANCE = new Car();

  private Car(){
  }

  public String getCar(){
    return speed +"|"+name;
  }

  public void setName(int name){
    this.name = name ;
  }

  public int getName(){
    return this.name ;
  }

  public static void main(String[] args) {
    Car c1 = Car.INSTANCE;
    c1.setName(123);
    Car c2 = Car.INSTANCE;
    c2.setName(3213);
    System.out.println(c1.equals(c2));
    System.out.println(c1.getName());
  }

}
