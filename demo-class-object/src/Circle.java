import java.math.BigDecimal;

public class Circle {
  private double radius;

  public Circle(){

  }

  public Circle(double radius){
    this.radius = radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public double getArea() {
    return BigDecimal.valueOf(this.radius).
    multiply(BigDecimal.valueOf(this.radius)).
    multiply(BigDecimal.valueOf(Math.PI)).doubleValue();

  }

  public static void main(String[] args) {
      Circle c1 = new Circle();
      c1.setRadius(33);
      System.out.println(c1.getArea());
      Circle c2 = new Circle(23);
      System.out.println(c2.getRadius());
  }

  
}
