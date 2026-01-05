package src;
public class DemoException {

  // Java
  // 1. Class and Object (returb)
  // 2. Exception Object (throw)

  // Runtime error
  // 1. NullPointerException
  // 2. ArrayIndexOutOfBoundsException
  // 3. StringIndexOutOfBoundsException

  // 4. IllegalArgumentException
  public static char firstChar(String s) {
    // if (s == null) return ' ';
    if (s == null) {
      throw new IllegalArgumentException("String s must not be null");
    }
    return s.charAt(0);
  }

  public static String fullName(String firstName, String lastName) {
    if (firstName == null || lastName == null) {
      throw new IllegalArgumentException(
          "firstName and lastName must not be null");
    }
    return firstName + " " + lastName;
  }


  public static void main(String[] args) {
    fullName("ABC", "BCDD"); // return "ABC BCDD"
    // fullName(null, "null"); // would throw IllegalArgumentException

    String lastName = null;
    try {
      fullName("John", lastName);
    } catch (IllegalArgumentException e) { // catch the exception object
      System.out.println("Caught exception: " + e.getMessage());
    }
  }

  // 5. NumberFormatException
  public static int parseAge(String ageStr) {
    try {
      return Integer.parseInt(ageStr);
    } catch (NumberFormatException e) {
      System.out.println("Invalid age format: " + e.getMessage());
      return -1; // default value
    }
  }

  // 6. ArithmeticException
  public static int divide(int a, int b) {
    try {
      return a / b;
    } catch (ArithmeticException e) { // catch division by zero
      System.out.println("Error: Division by zero is not allowed.");
      return 0; // default value
    }

  }
}


