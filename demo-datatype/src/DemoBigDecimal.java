import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {

  public static void main(String[] args){
    double r1 = 0.1 + 0.2;
    System.out.println(r1);

    //two way to create BigDecimal
    BigDecimal bd = new BigDecimal("0.1");
    BigDecimal bd2 = BigDecimal.valueOf(0.2);
    BigDecimal bd3 = bd.add(bd2); // Math +

    System.out.println(bd3);

    float f1 = bd3.floatValue();
    double d1 = bd3.doubleValue();
    System.out.println(f1 +" | " + d1);

    String s1 = bd3.toString();
    System.out.println(s1);

    // Subtract() , Multiply() divide()

    BigDecimal bd4 = bd.subtract(bd2);
    System.out.println(bd4);

    System.out.println(0.3-0.1); //0.19999999999999998
    double result = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(result); //0.2

    System.out.println(0.3/0.1);
    double d2 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(d2);

    //10/3 = 0.3333.... < error
    double d3 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3),3 ,RoundingMode.DOWN).doubleValue();
    System.out.println(d3);

    double d4 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(8),1 ,RoundingMode.HALF_UP).doubleValue();
    System.out.println(d4);

    //multiply > rounding
    double m1 = BigDecimal.valueOf(3.3333).multiply(BigDecimal.valueOf(2)).setScale(2,RoundingMode.DOWN).doubleValue();
    System.out.println(m1);



  }
  
}
