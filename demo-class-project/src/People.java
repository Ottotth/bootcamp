import java.util.Scanner;

public class People {
  private String name;
  private double height;
  private double weight;
  

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

  public static void main(String[] args) {
    People people1 = new People();

    Scanner scanner = new Scanner(System.in);

    System.out.print("Name?");
    people1.setName(scanner.next());
    scanner.nextLine();
    System.out.print("Height?");
    people1.setHeight(scanner.nextDouble());
    scanner.nextLine();
    System.out.println("Weight?");
    people1.setWeight(scanner.nextDouble());
    scanner.nextLine();

    System.out.println("Name:" + people1.getName() + "\n" 
    + "Height:" + people1.getHeight() + "cm" + "\n"
    + "Weight:" + people1.getweight() + "kg");
  }
  
}
