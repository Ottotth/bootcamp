package src;

public class BussinessRuntimeException extends RuntimeException { // Unchecked exception
  private int code;

  public static BussinessRuntimeException of(SysCode sysCode) {
    return new BussinessRuntimeException(sysCode);
  }

  public BussinessRuntimeException(SysCode sysCode) {
    super(sysCode.name());
    this.code = sysCode.getCode();
  }

  public int getCode() {
    return code;
  }

  public static void main(String[] args) {
    // Exception Polymorphism
    try{
      int[] arr = new int[5];
      System.out.println(arr[10]); // This will throw ArrayIndexOutOfBoundsException
    } catch (RuntimeException e) { // Catching the superclass
      System.out.println("Caught RuntimeException: " + e.getMessage());
    }
  }
  
}
