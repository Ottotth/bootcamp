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


}
