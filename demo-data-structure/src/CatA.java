import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CatA {
  private String name;
  private int id;

  public CatA(String name, int id){
    this.name = name;
    this.id = id;
    
  }

  public int getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public String toString(){
    return this.name + "|" + this.id;
  }

  
  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof CatA))
      return false;
    CatA c = (CatA) o;
    return c.name == this.name && c.id == this.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.id); // Hash based on name and id
  }
  

  public static void main(String[] args) {
    ArrayList<CatA> cats = new ArrayList<>();
    //CatA c1 = new CatA("helen");
    //CatA c2 = new CatA("tom");
    //CatA c3 = new CatA("helen");

    cats.add(new CatA("helen",1001));
    cats.add(new CatA("tom",1002));
    cats.add(new CatA("john",1003));

    System.out.println(cats);

    cats.remove(new CatA("john",1003));

    System.out.println(cats);
    
    
    ArrayList<CatA> catList = new ArrayList<>();
  }
  
}
