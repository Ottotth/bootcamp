import java.util.Hashtable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoHashTable {

  public static void main(String[] args) {
    //HashTable vs HashSet
    Hashtable<Integer , Integer > h = new Hashtable<>();
    //task: use a global AtomicInteger to produce unique keys across threads
    AtomicInteger id = new AtomicInteger(0);
    Runnable task = new Runnable(){
      @Override
      public void run(){
        for (int k = 0; k < 1000; k++){
          int j = ThreadLocalRandom.current().nextInt(1000);
          int key = id.getAndIncrement();
          h.put(key, j);
        }
      }
    };
    
    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);

    try {
      t1.start();
      t2.start();
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      // TODO: handle exception
    }

    System.out.println(h.size());
    System.out.println(h);
  }
  
}
