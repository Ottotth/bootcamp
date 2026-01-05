public class Dogg {
  private Dogg dog;
  private String name;

  //LinkedList

  public Dogg(String name){
    this.name = name;
  }

  public void setNext(Dogg nextDog){
    this.dog = nextDog;
  }

  public Dogg getNext(){
    return this.dog;
  }

  public String getName(){
    return this.name;
  }

  public static void removeLast(Dogg dog){
    if (dog == null) return;
    Dogg head = dog;
    while(head != null){
      if(head.getNext().getNext() == null){
        head.setNext(null);
        break;
      }
      head = head.getNext();
    }
  }

  public static Dogg removeTaget(Dogg dog, Dogg target){
    if(dog == null) return null;
    Dogg head = dog;
    Dogg temp;
    while (head.getNext() != null){ 
      if (head.equals(target)){
        dog = head.getNext();
        return dog;
      }
      if(head.getNext().equals(target)){
        temp = head.getNext().getNext();
        head.getNext().setNext(temp);
      }
      head = head.getNext();
    }
    return head;

  }

  @Override
  public boolean equals(Object o){
     if (o == this)
      return true;
    if (!(o instanceof Dogg))
      return false;
    Dogg c = (Dogg) o;
    return this.name == c.name;
  }


  public static void main(String[] args) {
    Dogg d1 = new Dogg("Peter");
    d1.setNext(new Dogg("Tom"));
    d1.getNext().setNext(new Dogg("Nick"));

    


    System.out.println(d1.getNext().getNext().getName());

    //Find the last Dogg(LinkedList -> while)
    Dogg head = d1;
    int count = 0;
    while(head != null){
      System.out.println("dog = " + head.getName());
      head = head.getNext();
      count++;
    } 
   
    System.out.println( "----------");
    
    removeLast(d1);

    head = d1;
    while(head != null){
      System.out.println("dog = " + head.getName());
      head = head.getNext();
      count++;
    } 

    d1 = removeTaget(d1,d1);
    System.out.println(d1.getName());

    //sum x + y
    int x = 5;
    int y = 10;
    int sum = x + y;
    System.out.println("sum = " + sum);
    
    


  }

}
