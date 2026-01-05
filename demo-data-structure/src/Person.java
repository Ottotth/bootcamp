import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Person implements Comparable<Person> {
  private String name;
  private int ages;
  private Occupation occupation;

  public static enum Occupation {
    DOCTOR, PROGRAMMER , TEACHER
  }

  public Person(String name, int ages) {
    this.name = name;
    this.ages = ages;
  }

  public Person(String name, int ages , Occupation occupation) {
    this.name = name;
    this.ages = ages;
    this.occupation = occupation;
  }

  public int getAges() {
    return ages;
  }

  public String getName() {
    return name;
  }

  public Occupation getOccupation() {
    return occupation;
  }


  
  @Override
  public int compareTo(Person other) {
    if (this.ages < other.ages) {
      return 1;
    } else if (this.ages > other.ages) {
      return -1;
    } else {
      return 0;
    }
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", ages=" + ages + " occupation=" + occupation +
        "}\n";
  }

  public static void main(String[] args) {
    List<Person> people = new ArrayList<>();
    people.add(new Person("John", 25));
    people.add(new Person("Alice", 30));
    people.add(new Person("Bob", 60));
    people.add(new Person("Eve", 28));

    //System.out.println("Before sorting: \n" + people);
    //people.sort(null); // sort using natural order (compareTo)
    //System.out.println("After sorting: \n" + people);

    PriorityQueue<Person> personQueue = new PriorityQueue<>(people);
    System.out.println(personQueue.poll()); // Bob 60
    System.out.println(personQueue.poll()); // Alice 30
    personQueue.add(new Person("Jane", 10));
    personQueue.add(new Person("Tom", 80));
    System.out.println(personQueue.poll()); // Tom 80
    System.out.println(personQueue.poll()); // John 25
    System.out.println("----------------  ----------");
    PriorityQueue<Person> personQueue2 = new PriorityQueue<>(new SortedByRule1());
    personQueue2.add(new Person("John", 25 , Occupation.PROGRAMMER));
    personQueue2.add(new Person("Alice", 30 , Occupation.DOCTOR));
    personQueue2.add(new Person("Bob", 60 , Occupation.TEACHER));
    personQueue2.add(new Person("Eve", 28 , Occupation.PROGRAMMER));
    personQueue2.add(new Person("Tom", 40 , Occupation.DOCTOR));
    personQueue2.add(new Person("Jane", 35 , Occupation.TEACHER));
    personQueue2.add(new Person("Sam", 50 , Occupation.PROGRAMMER));
    personQueue2.add(new Person("Kate", 45 , Occupation.DOCTOR));

    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
  }
  
}