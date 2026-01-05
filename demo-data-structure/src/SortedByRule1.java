import java.util.Comparator;

public class SortedByRule1 implements Comparator<Person> {
  
  // Sort by occupation first , then by ages
  @Override
  public int compare(Person p1 , Person p2) 
  {
    if (p1.getOccupation().ordinal() < p2.getOccupation().ordinal()) {
      return -1;
    } else if (p1.getOccupation().ordinal() > p2.getOccupation().ordinal()) {
      return 1;
    } else {
      // same occupation , sort by ages
      if (p1.getAges() < p2.getAges()) {
        return 1;
      } else if (p1.getAges() > p2.getAges()) {
        return -1;
      } else {
        return 0;
      }
    }
   
  }
}
