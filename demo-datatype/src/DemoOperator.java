public class DemoOperator {

  public static void main(String[] args) {

    System.out.println("5/2" + " = " + (5f / 2));

    double a = 0.1;
    double b = 0.2;
    System.out.println("0.1 + 0.2 = " + (a + b));

    int y = 10 % 3; //% is 餘數 
    System.out.println("10 % 3 = " + y); // 印出 1

    int x = 4;
    boolean isOddNumber = (x % 2) != 0;
    System.out.println(x + " is odd number? " + isOddNumber);

    //char single quote
    char c1 = 'B';
    char c2 = 'b';
    System.out.println(c1 == c2); //false

    float f1 = 0.1f;
    System.err.println(f1);

    char c3 = '你';
    char c4 = '好';
    System.out.println("" + c3 + c4);

    byte b1 = (byte) 129L;
    System.out.println("b1 = " + b1);

    String s1 = "Hello";
    System.out.println(s1);

    //+1 -1
    int t1 = 0;
    t1++;
    ++t1;
    t1 = t1 + 1;
    t1 += 1;
    System.out.println("t1 = " + t1);

    //Comparison
    //> , < , >=, <=, ==, !=
    float score = 59.5f;  
    boolean isPass = score >= 50;
    System.err.println("isPass = " + isPass);

    String s = "Hi world";

    //Stiring Function
    //Function 1 : equals (dont use == to compare string)
    System.out.println(s.equals("Hi world")); //true
    System.out.println(s.equals("hi World")); //false

    //Function 2 : length
    System.out.println("s length = " + s.length()); //9

    //Function 3 : charAt() Find character at specified index form 0
    System.out.println("s charAt(5) = " + s.charAt(5)); //r

    System.out.println("last char = " + s.charAt(s.length() - 1)); //d
    System.out.println("middle char = " + s.charAt(s.length() / 2)); //w


    
    
  }
  
}
