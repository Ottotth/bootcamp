public class Cat extends Animal {
  private String hair;

  public Cat(String name , int age){
    super(name , age);
  }

  public void setHair(String hair){
    this.hair = hair;
  }

  public String getHair(Cat cat){
    return cat.hair;
  }

  public static void main(String[] args) {
    Cat c1 = new Cat("yy", 444);
    c1.sound("mimi");

    Object[] o = new Object[3];
    o[1] = new Cat("tt",222);
    o[2] = new Dog("dd",2322);

    for (Object obj : o ){
      if(obj instanceof Dog){
        Dog dog =  (Dog) obj;
      }
    }
  }

}
