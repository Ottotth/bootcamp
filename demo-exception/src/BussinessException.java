package src;

// Exception class has an attribute call message

// 1.Unchecked exception: RuntimeException and its subclasses
  //
// 2.Checked exception: Exception and its subclasses (excluding RuntimeException and its subclasses)
// throw checked exception must be declared in method signature with "throws" keyword
// method callers has to try-catch for recovery
public class BussinessException extends Exception { // Checked exception
  private int code;

  public static BussinessException of(SysCode sysCode) {
    return new BussinessException(sysCode);
  }

  public BussinessException(SysCode sysCode) {
    super(sysCode.name());
    this.code = sysCode.getCode();
  }

  public int getCode() {
    return code;
  }

  public static String fullName(String firstName, String lastName)
      throws BussinessException {
    if (firstName == null || lastName == null) {
      throw new BussinessException(SysCode.NULL_PARAM);
    }
    return firstName + " " + lastName;
  }

  public static void main(String[] args) {
    try {
      fullName("John", null);
    } catch (BussinessException e) {
      System.out.println(
          "Caught BussinessException: " + e.getMessage() + ", code: " + e.getCode());
    }
  }
  

}
