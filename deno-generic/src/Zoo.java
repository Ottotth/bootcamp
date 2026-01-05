import java.util.ArrayList;
import java.util.List;

// Generic Class with 2 type parameters T and U
// Can control the type of T and U with "extends" keyword
public class Zoo <T extends Animal, U extends Worker> {
  private List<T> animal;//tigers , pandas ...extends Animal
  private List<U> worker;//keepers , cleners ...extends Worker

  public Zoo(List<T> animal, List<U> worker) {
    this.animal = animal;
    this.worker = worker;
  }

  public List<T> getAnimal() {
    return animal;
  }

  public void setAnimal(List<T> animal) {
    this.animal = animal;
  }

  public List<U> getWorker() {
    return worker;
  }

  public void setWorker(List<U> worker) {
    this.worker = worker;
  }

  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
    List<Worker> workers = new ArrayList<>();
    Zoo<Animal, Worker> zoo = new Zoo<>(animals, workers);

    animals.add(new Tiger());
    animals.add(new Panda());
    // animals.add(new Cleaner()); Error not type of Animal

    
    
  
  }
}
