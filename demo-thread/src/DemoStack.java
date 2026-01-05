import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class DemoStack {

  public static void main(String[] args) {
    //Stack
    //LIFO (push and pop), similar to Deque(LinkList)

    Stack<String> names = new Stack<>();

    names.add("peter");
    names.push("john");
    names.push("david");

    System.out.println(names.pop()); // david
    System.out.println(names.pop()); // john
    System.out.println(names.size()); // 1

    System.out.println("-------------");

    Stack<Integer> ages = new Stack<>();
    //LinkedList<Integer> ages = new LinkedList<>();

    Runnable addInt = new Runnable() {
      @Override
      public void run(){
        for(int i = 0 ; i < 200 ; i++){
          ages.push(i);
        }
      }
    };

    Thread t1 = new Thread(addInt);
    Thread t2 = new Thread(addInt);

    try{
      t1.start();
      t2.start();
      t1.join();
      t2.join();
    } catch(InterruptedException e){

    }

    System.out.println(ages.size());

  }
  
}
