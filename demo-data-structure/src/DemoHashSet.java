
import java.util.ArrayList;
import java.util.HashSet;



public class DemoHashSet{
  // Java Collections: List/Set/Queue
  // List : ArrayList / LinkedList
  // Set : HashSet / TreeSet
  // Queue : LinkedList / PriorityQueue
  // Set (Avoid Duplicates)


  public static void main(String[] args) {
    HashSet<String> names = new HashSet<>();
    names.add("john");
    names.add("tom");
    names.add("ken");
    names.add("john"); // Duplicate , ignored
    System.out.println(names.size());
    System.out.println(names); // No ordering

    ArrayList<Integer> ages = new ArrayList<>();
    ages.add(25);
    ages.add(30);
    ages.add(25); // Duplicate , allowed
    System.out.println(ages.size());
    System.out.println(ages); // Has ordering

    // Convert ArrayList to HashSet , remove duplicates by adding one by one
    HashSet<Integer> agesSet = new HashSet<>();
    for (Integer age : ages) { // performance issue : loop > duplicates check
      agesSet.add(age); // Add to HashSet
    }
    System.out.println(agesSet.size());
    System.out.println(agesSet); // No ordering

    // Find Duplicates in ArrayList
    HashSet<Integer> agesSet2 = new HashSet<>();
    for (Integer age : ages) { // Ingter equals()
      if (!agesSet2.add(age)) { // If add() returns false , means duplicate
        System.out.println("Duplicate found: " + age);// If duplicate, do something
      }
    }

    ArrayList<CatA> catList = new ArrayList<>();
    catList.add(new CatA("helen", 1001));
    catList.add(new CatA("tom", 1002));
    catList.add(new CatA("john", 1003));
    catList.add(new CatA("helen", 1001));
    System.out.println(catList);

    HashSet<CatA> catSet = new HashSet<>();
    for (CatA cat : catList) {
      if (catSet.add(cat)) { // use CatA.equals() and CatA.hashCode() to check duplicates
        catSet.add(cat);
      } else {
        System.out.println("Duplicate CatA found: " + cat);
      }
    }
    System.out.println(catSet);

    System.out.println("--- Convert ArrayList to HashSet directly ---");
    System.out.println(catList);
    HashSet<CatA> catSet2 = new HashSet<>(catList);
    System.out.println(catSet2);

    //contains()
    //isEmpty()
    //remove()
    //clear()

    if (catSet2.contains(new CatA("tom", 1002))) {
      System.out.println("CatA tom exists in the set");
    }

    if (catSet2.isEmpty()) {
      System.out.println("CatA set is empty");
    } else {
      System.out.println("CatA set is not empty");
    }

    catSet2.remove(new CatA("john", 1003));
    System.out.println(catSet2);

    catSet2.clear();
    System.out.println("After clear, CatA set size: " + catSet2.size());

    if (catSet2.isEmpty()) {
      System.out.println("CatA set is empty");
    } else {
      System.out.println("CatA set is not empty");
    }


    HashSet<Integer> hs = new HashSet<>();
    hs.add(22);
    hs.add(777);
    hs.add(87);
    hs.add(99);
    hs.add(0123);
    System.out.println(hs); // No ordering
  }
}
