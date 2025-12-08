public class Demo {
  public static void main(String[] args) {
    // For Loop
    long x = 2;
    int times = 9;

    // for (initialization; condition; increment/decrement)
    for (int i = 0; i < times; i++) {
      x = x * 2;
      System.out.println("x = " + x + " | times = " + (i + 1));

    }

    for (int t = 0; t <= 100; t++) {
      boolean isOddNumber = (t % 2) != 0;
      if (isOddNumber == true) {
        System.out.println(t + " is odd number");
      } else {
        System.out.println(t + " is even number");
      }
    }

    String name = "David";
    for (int i = 0; i < name.length(); i++) {
      if (name.charAt(i) == 'i') {
        System.out.println("Found i at index " + (i+1) );
      }
    }

  }

}
