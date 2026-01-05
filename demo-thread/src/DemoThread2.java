import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoThread2 {
  
  public static void main(String[] args) {
    List<Integer> integers = new Vector(); 
    // Vector is a synchronized of ArrayList > can be lock and only have one key
    // But Vector is slow

    Runnable addTask = new Runnable(){
      @Override
      public void run(){
        for(int i = 0 ; i < 100 ; i++){
          // bot thread-safe
          integers.add(i);
        }
      }
    };

    Thread t1 = new Thread(addTask);
    Thread t2 = new Thread(addTask);

    try{
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    } catch (InterruptedException e){
      System.out.println(e);
    } finally {
      System.out.println(integers); //190 > not thread safe
    }

  }
  
}
