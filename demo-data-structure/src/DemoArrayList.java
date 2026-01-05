
import java.util.ArrayList;

public class DemoArrayList {
//Array Disadvantages:
//1.Fix length,
int[] arr = new int[3];
  
public static void main(String[] args) {
  //Data Structure -> array and linkedlist (memory)
//High level Structure - > ArrayList
	ArrayList<String> names = new ArrayList<>();
  // 1.Add
	names.add("john"); // in Theory : Loop (but actually not)
  names.add("tom");
  names.add("ken");

  System.out.println(names);

  ArrayList<Integer> scores = new ArrayList<>();
  scores.add(13);
  scores.add(67);
  scores.add(88);

  // 2.Remove
  names.remove("tom"); //remove -> String.eqauls()
  names.remove(1); // remove index 1

  String s1 = new String("ooo");
  String s2 = new String("ooo");
  System.out.println(s1.equals(s2)); 
  // Because java have rewirte String.equals
  // If is the ref type create by us. We need to rewirte the equals

  // Array has ordering.
  // 3. atFirst() / atLast() == add()
  names.add("Jenny");
  System.out.println(names);
  names.addFirst("tommy");
  System.out.println(names);

  // 4. clear() clear the array list, ArrayList.size() = 0
  System.out.println(names.size());
  //names.clear();
  System.out.println(names);
  System.out.println(names.size());

  //5. contains() --> for loop .eqauls()
  System.out.println(names.contains("Jenny"));

  //6. isEmpty
  System.out.println(names.isEmpty());
  names.clear();
  System.out.println(names);
  System.out.println(names.size());
 
}

}
