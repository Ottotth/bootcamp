import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
  // Priority Queue -> Queue
  // ArrayDeque -> Deque
  // LinkedList -> Queue , Deque

  public static void main(String[] args) {
   //Policymorphism

  ArrayDeque<String> adq = new ArrayDeque<>();
  Deque<String> dq = new ArrayDeque<>();
  Queue<String> q = new ArrayDeque<>();
  Collection<String> c = new ArrayDeque<>(); //hiding some methods

  dq.poll(); // remove
  dq.push("abc"); // add to first
  dq.pollLast(); // remove last
  dq.pollFirst();// remove first
  
  q.poll(); // remove
  q.add("def"); // add to last
  // q.pollLast(); // not available
  // q.pollFirst(); // not available

  c.add("asd");
  // c.poll(); // not available
  // c.push(); // not available

  // We have only one Object ArrayDeque in the memory
  ArrayDeque<String> name = new ArrayDeque<>();
  Collection<String> col1 = name;
  Deque<String> dq1 = name;
  Queue<String> qq1 = name; // hiding some methods

  // Queue
  Queue<CatA> catQueue = new LinkedList<>(); //90% use case use LinkedList for Queue
  catQueue.add(new CatA("John", 20));
  catQueue.add(new CatA("Jane", 22));
  catQueue.add(new CatA("Bob", 19));

  System.out.println(catQueue.peek()); // View the head of the queue

  CatA firstCat = catQueue.poll(); // Remove the head of the queue , pivk first cat
  System.out.println("Removed Cat: " + firstCat.getName());
  System.out.println(catQueue.peek());
  System.out.println(catQueue.size());
  
  // Queue String
  Queue<String> fruits = new ArrayDeque<>();
  fruits.add("Apple");
  fruits.add("Orange");
  fruits.add("kiwi");
  fruits.add("Banana");

  System.out.println(fruits.contains("kiwi"));
  System.out.println(fruits.size());
  fruits.remove("Orange"); // loop
  System.out.println(fruits);


  // Queue Loop -> Consume 消耗
  // First In First Out (FIFO)
  while (!fruits.isEmpty()) {
    String fruit = fruits.poll(); // remove the head of the queue
    System.out.println("Processing fruit: " + fruit);
  }
  
  






  }
  
}
