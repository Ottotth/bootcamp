public class App {

  public static void main(String[] args) {
    // thread 0 (main thread)

    int a = 5;
    a++; //--> thread 1
    a++; //--> thread 2
    System.out.println("Final value of a: " + a); // Should print 7
  }
  
}
