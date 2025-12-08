public class Goodbye {
  public static void main(String[] args) {
    System.out.println("Goodbye, World!");
    System.out.println("你好，\n世界！");

    //int > bye, short, byte, long
    //float > double
    //Single Character > char A/B/C
    //true or false > boolean

    int x = 10;
    int y = 7;
    System.out.println(x + y);

    x = 20;
    System.out.println(x + y);

    y = 100;
    System.out.println(x + y);

    //double
    double a = 0.52222;
    double b = 0.1123123;
    System.out.println(a + b);

    double c = 123; //implicit conversion
    System.out.println(c);

    //byte stort int long
    //byte (-128 ~ 127)
    //short (-32,768 ~ 32,767)
    //int (-2,147,483,648 ~ 2,147,483,647)
    //long (+ - 2^63)

    byte b1 = 127; 
    long l1 = 20000000000L ;
    System.out.println(l1 + b1);
 
  }
    
  
}
