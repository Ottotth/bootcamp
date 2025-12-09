import java.util.Scanner;

public class DemoScanner {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int ii = scanner.nextInt();
    if(ii%2 == 0){
      System.out.println(ii + " is Even Number");
    } else {
      System.out.println(ii + " is Odd Number");
    }
  }
  
}
