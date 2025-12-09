public class DemoASCII {
  public static void main(String[] args) {
    // convert char to int
    char c = 'a'; // 97 in acsii
    int x = c;
    System.out.println(x);

    int y = 65;
    char c2 = (char) y;

    System.out.println(c2);

    //Overflow
    int x1 = 128;
    byte b1 = (byte) x1;
    System.out.println(b1);

    
    
  }
  
}
