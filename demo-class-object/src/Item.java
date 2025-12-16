public class Item {
  private double price;
  private int quantity;


  public Item (double price, int quantity){
    this.price = price;
    this.quantity = quantity; 
  }

  public double amount(){
    double amount = this.price * this.quantity;
    return amount;
  }

  public double getPrice(){
    return this.price;
  }

  public int getQuantity(){
    return this.quantity;
  }

  public static void main(String[] args) {
    Item i1 = new Item(19, 3);
    Item i2 = new Item(4 , 5);
    System.out.println(i1.amount());

    

  }
  
}
