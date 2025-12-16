// Child Class

import java.util.Objects;

public class Dog extends Animal{

  // Constructor (name , age)
  public Dog(String name , int age){
    super(name , age); // calling parent empty constructor
  }

  // implicitly inherit parent 's all instance methods
  @Override // check if the parent has this method , and override the method in parent
  public String getName(){
    return super.getName(); // super = call the parent class
  }

  // this vs o name 
  // remember !!!
  @Override
  public boolean equals(Object o){
    if ( o == this) return true; //same java object in memory
    if ( !(o instanceof Dog) ) return false; // is it same type of object
    Dog dog = (Dog) o;
    return dog.getName().equals(super.getName())
    && dog.getAge() == super.getAge(); // check the info are they same
  }

  @Override 
  public int hashCode(){
    // generate an int value based on given values
    return Objects.hash(super.getName(),super.getAge());
  } 

  public String toString(){

  return "Dog("+super.toString()+")";
  }

  public static void main(String[] args) {
    Cat c1 = new Cat("AA" , 1333);
    Dog d2 = new Dog("BGV" , 32323);

    
    System.out.println("Dog name: " +d2.getName() +" | Age: " + d2.getAge());
    System.out.println("Cat name: " +c1.getName() +" | Age: " + c1.getAge());
  }



  
}