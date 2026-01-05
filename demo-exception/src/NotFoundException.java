package src;

public class NotFoundException extends BussinessException { // Checked exception
  private int code;

  public static NotFoundException of(SysCode sysCode) {
    return new NotFoundException(sysCode);
  }

  private NotFoundException(SysCode sysCode) {
    super(sysCode);
    this.code = sysCode.getCode();
  }

  public int getCode() {
    return code;
  }

}
