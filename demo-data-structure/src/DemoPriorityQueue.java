import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  
  public static void main(String[] args) {
    //
    Queue<String> names = new PriorityQueue<>();
    names.add("John");
    names.add("Tom");
    names.add("Alice");
    names.add("Eve");
    names.add("Leo");
    names.add("Bob");
    System.out.println(names); // Unordered

    // Order when happening?
    // Order happen when polling/removing
    // Everytime poll , it will reorder the queue based on natural order
    // Slow perfoemance if many poll/remove operation
    System.out.println(names.poll()); // Alice
    System.out.println(names.poll()); // Bob

    Queue<Integer> ages = new PriorityQueue<>();
    ages.add(25);
    ages.add(30);
    ages.add(20);
    ages.add(35);
    System.out.println(ages);
    System.out.println(ages.poll()); // 20
    System.out.println(ages.poll()); // 25
    System.out.println(ages);

    
  }
}
