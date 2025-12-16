public abstract class Shape {
  private String color;

  
  public Shape(String color ){
    this.color = color;

  }

  public String getColor(){
    return this.color;
  }

  
  // if override equals can use this 
  // return Object.equals(shape.getColor() , this.color) 
  // && Object.equals(shape.getShape() , this.shape)

  // abstract method (without implemention)
  // Child class MUST implement all abstract methods
  abstract double calArea();
  //
  @Override
  public String toString(){
    return "Color:"+this.color ;
    
  }

  
}
