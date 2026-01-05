
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class DemoLinkedList {

  //Java LinkedList : Double LinkedList > have record first and last

  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<>();
    names.add("qqq");
    names.add("bbb");
    names.add("lll");
    
    System.out.println(names.get(2));
    names.remove("qqq");


    // Java : ArrayList vs LinkedList
    // add , size , remove , contains....etc
    // Nomral System : mostly use ArrayList , If need to always do action in First or Last , then use Linkedlist

    // get(index) 
    // LinkedList > first.get().get().get..... performance bad O(n) 
    // ArrayList > direct to the postion    performance good O(1)
    
    // Polymorphism 多態性
    List<String> emails = new ArrayList<>();
    emails.add("otto@gmail.com"); // use diferent methods > ArrayList.add()
    emails = new LinkedList<>();
    emails.add("abc@gmail.com"); // use diferent methods > LinkedList.add()
    //emails = new Vector<>();
    //emails = new Stack<>();

    System.out.println(emails.get(0));

    Set<Integer> i1 = new HashSet<>();
    i1.add(55);
    i1.add(33);
    i1.add(55);
    System.out.println(i1.size());
    
    

  }
  
}
