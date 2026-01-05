import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  // ArrayList, LinkedList, HashSet > contain some type of object

  // HashMap
  // Key > Value eg. Student ID find Student **
  // Use Key to find target object (Value) quickly, if use ArrayList to find object, need to loop one by one
  // Good for large data set , fast find O(1) , vs ArrayList find O(n)

  public static void main(String[] args) {

    //ArrayList
    ArrayList<CatA> cats = new ArrayList<>();
    cats.add(new CatA("tom" , 1001));
    cats.add(new CatA("peter" , 1002));
    cats.add(new CatA("david" , 1003));

    //HashMap
    Map<Integer, CatA> hMap = new HashMap<>();
    for (CatA cat : cats){
      hMap.put(cat.getId(),cat);
    }

    System.out.println(hMap.get(1002).getName());

    for(Map.Entry<Integer, CatA> entry : hMap.entrySet()){
      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

    CatA c = hMap.get(1003); // .get() is risky
     if (c != null){ // remove risk of NullPointerException
      System.out.println(c.getName());
    } else {
      System.out.println("Cat not found");
    }
    

  }

}
