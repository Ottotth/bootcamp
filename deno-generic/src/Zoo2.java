import java.util.LinkedList;
import java.util.List;

public class Zoo2 {
  // Normal way , Enough for most cases
  // No need Generic Class
  private List<Animal> animals;
  private List<Worker> workers;

  public Zoo2() {
    this.animals = new LinkedList<>();
    this.workers = new LinkedList<>();
  }

  public boolean addAnimal(Animal animal) {
    return animals.add(animal);
  }

  public boolean addWorker(Worker worker) {
    return workers.add(worker);
  }

  public List<Animal> getAnimals() {
    return animals;
  }

  public List<Worker> getWorkers() {
    return workers;
  }

  public static void main(String[] args) {
    Zoo2 zoo = new Zoo2();
    zoo.addAnimal(new Tiger());
    zoo.addAnimal(new Panda());
    zoo.addWorker(new Keeper());
    zoo.addWorker(new Cleaner());

    System.out.println("Animals in zoo: " + zoo.getAnimals());
  }
  
}
