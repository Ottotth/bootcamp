public class DemoObject {

  public static void main(String[] args) {
    // Object.class
    // All java object extends object.class

    //override this
    //toString() , equals() , hashCode()

    Dog d1 = new Dog("Happy" , 555);
    Dog d2 = new Dog("Happy" , 555);
    //before override
    System.out.println(d1.toString()); // Dog@4e25154f
    System.out.println(d1.hashCode()); // 1311053135
    System.out.println(d2.toString()); // Dog@70dea4e
    System.out.println(d2.hashCode()); // 118352462
    //after override
    System.out.println(d1.equals(d2)); // true
    System.out.println(d1.hashCode() == d2.hashCode());
    System.out.println(d1);
  }
  
}
