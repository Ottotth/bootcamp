public class Employee {
  private String name;
  private int age;
  private String email;

  public void setName(String name){
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }
  public static void main(String[] args) {
    String name = "otto";
    int age = 29;

    String name2 = "Tom";
    int age2 = 40;

    Employee e1 = new Employee();
    e1.setName("John");
    System.out.println(e1.getName());
    e1.setAge(90);
    System.out.println(e1.getAge());
    
  }
  
}
