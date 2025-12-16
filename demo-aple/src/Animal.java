// abstract 抽象
// absract class
//1. Cannot used to create object
//2. Treat it as Parent Class
//3. Has Attributtes (common attributes)
//4. Abstract methods

// Parent Class
public abstract class Animal {
  private String name;
  private int age;

  public Animal(String name , int age){
    this.name = name;
    this.age = age;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  @Override
  public String toString(){
    return "Animal("//
          + "name="+this.getName()//
          + "Age=" + this.getAge() + ")";
  }

  public static void main(String[] args) {
    
  }
  
}
