import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {

  public static void main(String[] args) {
    // Before Java 5 , Only use Array
    int[] integer = new int[2]; // Fix length
    List emails = new ArrayList(); // Java: compile time not ensure the type
    // List<Object> object = new ArrayList
    emails.add("a@gmail.com");
    emails.add("b@gmail.com");
    emails.add(100);
    emails.add(true);
    emails.add('a');
    // Java 5
    ArrayList<String> emails2 = new ArrayList<>();
    emails2.add("asd@ads.com");
    emails2.add("awsswd@ads.com");
  emails2.add("assadd@ads.com");
  
}
}