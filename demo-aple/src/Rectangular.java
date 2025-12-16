import java.math.BigDecimal;
import java.util.Objects;

public class Rectangular extends Shape {
  private double length;
  private double width;

  public Rectangular(double x, double y, String color) {
    super(color);
    this.width = x;
    this.length = y;
  }

  public double getWidth(){
    return this.width;
  }

  public double getLength(){
    return this.length;
  }

  @Override
  public double calArea() {
    double area = BigDecimal.valueOf(this.width)
        .multiply(BigDecimal.valueOf(this.length)).doubleValue();
    return area;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Rectangular))
      return false;
    Rectangular r = (Rectangular) o;
    return r.getWidth() == this.width && r.getLength() == this.length && r.getColor() == super.getColor();
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.width , this.length , super.getColor());
  }

  public String toString(){
    return "Rectangular Width:" + this.width + " | " 
    + "Rectangular Length:" + this.length  + " | "
    + "Area :" + this.calArea() + " | " 
    + super.toString();
  }



  public static void main(String[] args) {
    Rectangular r1 = new Rectangular(2, 3, "Red");
    Rectangular r2 = new Rectangular(2, 3, "Red");
    System.out.println(r1);
    System.out.println(r1.equals(r2));

  }

}
