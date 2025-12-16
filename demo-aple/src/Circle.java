import java.util.Objects;

public class Circle extends Shape {
  private double radius;

  public Circle(double radius, String color ) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double calArea() {
    double area = this.radius * this.radius * Math.PI;
    return area;
  }


  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true; 
    if (!(o instanceof Circle))
      return false; 
    Circle circle = (Circle) o;
    return circle.radius == this.radius
        && circle.getColor().equals(super.getColor());
  }

  @Override
  public String toString(){
    return "Circle Radius:"
    + this.radius + " | " 
    + super.toString();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.radius , super.getColor() );
  }


  public static void main(String[] args) {
    Circle c1 = new Circle(13, "Red" );
    Circle c2 = new Circle(13, "Red" );
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c1.calArea());
    System.out.println(c1.equals(c2));
    System.out.println(c1.toString());
  }

}
