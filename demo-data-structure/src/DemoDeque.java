import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {

  public static void main(String[] args) {
  
  Deque<CatA> catDeque = new LinkedList<>(); //90% use case use LinkedList for Queue
  catDeque.add(new CatA("John", 20));
  catDeque.add(new CatA("Jane", 22));
  catDeque.add(new CatA("Bob", 19));
  catDeque.addFirst(new CatA("Alice", 18)); // add to the front
  catDeque.addLast(new CatA("Tom", 21)); // add to the end

  // Deque can add First and Last , Queue can only add last
  // LIFO

  System.out.println(catDeque.poll()); // remove first
  System.out.println(catDeque.pollLast()); // remove last
  System.out.println(catDeque);
  System.out.println(catDeque.peek());
  System.out.println(catDeque.peekLast());

  while (!catDeque.isEmpty()) {
    CatA cat = catDeque.poll();
    System.out.println("Processing Cat: " + cat);
  }

  System.out.println("Deque size after processing: " + catDeque.size());
  
}
}
