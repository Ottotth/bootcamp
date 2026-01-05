import java.math.BigDecimal;
import java.util.List;

public abstract class Shape {
  public abstract double area();


  public static double totalAreaRaw(List<Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (Object obj : shapes) {
      Shape shape = (Shape) obj; // need cast
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }

  // Generic Method : can accept any type T (parent-child relationship)
  // Confirm the of T in compile time
  public static <T extends Shape> double totalArea(List<T> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (T shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }

  // Bounded WildCard : can accept any type that is child of Shape
  // Same as <T extends Shape> 
   public static double totalAreaBoundedWildCard(List<? extends Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();

    
  }


  
}
