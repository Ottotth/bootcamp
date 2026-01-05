public class DemoStatic {
// 1.static variable
// 2.static final variable (cannor not be modified)
// 3.instance variable (object variable)
// 4.fianl variable

  private static final int SECONDS_IN_MINUTE = 60;
  private static int idcounter = 0 ;
  private final String name;

  public DemoStatic(){
    this.name =  "Otto";
  }

}
