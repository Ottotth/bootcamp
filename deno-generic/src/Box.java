

public class Box<T> {
  private T value;

  public Box(){

  }

  public Box(T value){
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  //when do we confirm T?

  public static void main(String[] args) {
    // Compile time > confirm T
    Box<String> stringBox = new Box<>(); // confirm to String
    Box<Integer> integerBox = new Box<>(); // confirm ro int
    stringBox.setValue("ABC");
    System.out.println(stringBox.getValue().charAt(0));
    integerBox.setValue(123);

    // Compile time dont confirm T
    Box<Object> magicBox = new Box<>();
    magicBox.setValue("abc");
    // System.out.println(magicBox.getValue().charAt(0));
    //  ot work magicBox didnt confirm to String
    magicBox.setValue(0.5);
  }
  
}
