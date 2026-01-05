public class DemoThread {
  private int x;
  public final Object lock = new Object();

  public int getX() {
    return this.x;
  }
  

  // sync this method, support multi-thread
  // public synchronized void addOne(){
  public void addOne(){
    //this.x++; // x++ --> read and wirte
    synchronized(lock){ // use a object to lock one part of code
      this.x++;
    }
    System.out.println(x); // wont lock this
  }
  // other soulution is use AtomicIngeter

  public static void main(String[] args) {
    //main thread (worker 0)

    DemoThread demo = new DemoThread();
    int x = demo.getX();
    System.out.println("Value of x: " + demo.getX());

    // Task
    // annoymous class -> define and create object at Runtime
    Runnable addOneTask = new Runnable() {
      @Override
      public void run(){
        for (int i = 0 ; i < 100000 ; i++){
          demo.addOne();
        }
      }
    };

    Thread t1  = new Thread(addOneTask); // worker 1 
    Thread t2 = new Thread(addOneTask);

    // main thread tell t1 to start work
    try{
    t1.start(); //start() > task.run()
    t2.start();
    // No one  which thread run faster
    // Concept:Thread-safe : !safe > Primitive , ArrayList, HashSet.....etc
    t1.join();
    t2.join();
    // Java by default, main thread other thread to run finish
    } catch (InterruptedException e){

    }
    System.out.println(demo.getX());
  }
  
}
