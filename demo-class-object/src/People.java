
import java.util.Scanner;

public class People {
  private String name;
  private double height;
  private double weight;
  private String place;
  private int age;
  
  //methods ()

  public void setName(String name){
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public double getHeight() {
    return this.height;
  }

   public void setWeight(double weight){
    this.weight = weight;
  }

  public double getweight() {
    return this.weight;
  }

  public void setPlace (String place){
    this.place = place;
  }

  public String getPlace() {
    return this.place;
  }

  public void setAge(int age){
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  public double getBmi() {
    
    double bmi = this.weight / (this.height * this.height);
    return Math.round(bmi * 100.0) / 100.0; 
  }

  public String bmiIndex() {
    double yourBmi = this.getBmi();
    if (yourBmi < 18.5) {
      return "UnderWeight";
    } else if (yourBmi >= 18.5 && yourBmi <= 24.9) {
      return "Normal Weight";
    } else if (yourBmi >= 25.0 && yourBmi <= 29.9) {
      return "Overweight";
    } else if (yourBmi > 29.9 ){
      return "Obese";}
      else {
      return "your are not human";
      }
    }

    public boolean isAdult(){
      if (this.age >= 18){
        return true;
      } else {
        return false;
      }
    }
    



  public static void main(String[] args) {
    People people1 = new People();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Name?");
    people1.setName(scanner.next());
    scanner.nextLine();
    System.out.println("Height? (in Meter)");
    people1.setHeight(scanner.nextDouble());
    scanner.nextLine();
    System.out.println("Weight?");
    people1.setWeight(scanner.nextDouble());
    scanner.nextLine();
    System.out.println("Age?");
    people1.setAge(scanner.nextInt());
    scanner.nextLine();
    System.out.println("Where you from?");
    people1.setPlace(scanner.next());
    scanner.nextLine();
    scanner.close();

    System.out.println("Name:" + people1.getName() + "\n" 
    + "Height:" + people1.getHeight() + "cm" + "\n"
    + "Weight:" + people1.getweight() + "kg" + "\n"
    + "Form:" + people1.getPlace()+"\n"
    + "is Adult:" + people1.isAdult() +"\n"
    + "your bmi:" + people1.getBmi() +"\n"
    + people1.bmiIndex());

    

    
    

  }
  
}
