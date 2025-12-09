public class DemoWrapper2 {
  public static void main(String[] args) {
    // String
    // new > new address
    String s1 = "abc"; // Literal Pool : Store same string value Once
    String s2 = "abc"; // Literal Pool :so s1 and s2 are in same address
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1 == s2); // true

    String s3 = new String("abc"); // give new address to s3 out of the Literal Pool

    System.out.println(s1 == s3);

    String s4 = s1.replace("c", "y");
    System.out.println(s4);

    String name = "Otto";
    if (name.equals("Otto")) {
      System.out.println("hi");
    }

  }

}
