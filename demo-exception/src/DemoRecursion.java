package src;

public class DemoRecursion {

  public static void main(String[] args) {
    // 5+4+3+2+1
    int sum = 0;
    for (int i = 5; i >= 1; i--) {
      sum += i;
    }
    System.out.println(sum);
    System.out.println(rSum(5));
    System.out.println(rSum2(100));
    System.out.println(rMuti(24));
  }

  public static int sum(int n) {
    if (n <= 0)
      return -1;
    int sum = 0;
    for (int i = n; i >= 1; i--) {
      sum += i;
    }
    return sum;
  }


  // Recursion (Call itself)
  public static int rSum(int n) {
    // base criteria
    if (n <= 1)
      return 1;
    return n + rSum(n - 1);
  }

  // 100 + 98 + 96.....
  public static int rSum2(int n) {
    // base criteria
    if (n <= 2)
      return 2;
    return n + rSum2(n - 2);
  }

  // 3 * 6 * 9 * 12.....
  public static int rMuti(int n) {
    // base criteria
    if (n <= 3)
      return 3;
    return n * rMuti(n - 3);
  }
}
