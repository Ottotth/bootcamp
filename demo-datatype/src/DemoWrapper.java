public class DemoWrapper {
  public static void main(String[] args) {
    //8 Primitives
    //int -> Integer
    //1.Primitives > Storage and Math
    //2.Wrapper Class has methods (Wrapper is like a Object?)
    //3.Wrapper Class never use Math Oprators

    int x1 = 4;
    Integer x2 = 3;

    byte b1 = 13;
    Byte b2 = 13;

    short s1 = 9;
    Short s2 = 9;

    long l1 = 99999;
    Long l2 = 99999L;

    char c1 = 'C';
    Character c2 = 'C';

    boolean y = true;
    Boolean n = false;

    float f1 = 1.22f;
    Float f2 = 1.22f;

    double d1 = 1.44;
    Double d2 = 1.44;

    String string = "Hello";

    //1.Primitives > Storage and Math
    //2.Wrapper Class has methods (Wrapper is like a Object?)
    //3.Wrapper Class never use Math Oprators

    System.out.println(x2.compareTo(x1));
    System.out.println(x2.equals(x1));
  }
  
}
