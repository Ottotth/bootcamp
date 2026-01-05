package src;

public enum SysCode {
  NULL_PARAM(101), USERNAME_NOT_FOUND(404), _500_INTERNAL_SERVER_ERROR(500);

  private final int code;

  SysCode(int code) {
    this.code = code;
  }

  public int getCode() {
    return this.code;
  }
}
