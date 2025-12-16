public class Order {
  private int id;
  private Item[] items;

  public Order(int id){
    this.id = id;  
    this.items = new Item[0];
  }

  public int getId(){
    return this.id;
  }

  public void addItem(Item newItem) {
    // 1. create new array with length + 1
    Item[] newItems = new Item[this.items.length + 1];
    // 2. put the old array to new array
    for (int i = 0; i < this.items.length; i++) {
      newItems[i] = this.items[i];
    }
    // 3. put the new order to the last of the array
    newItems[newItems.length - 1] = newItem;
    // 4. replace new array to old array
    this.items = newItems;
    }

    public double getOrderAmount(){
      double amount = 0;
      for (int i = 0 ; i < this.items.length ; i++ ){
        amount = amount + this.items[i].amount();
      }
      return amount;
    }
  public static void main(String[] args) {
    Order o1 = new Order(102);
    Item a1 = new Item(12,3);
    o1.addItem(a1);
    o1.addItem(a1);
    
    System.out.println(o1.getOrderAmount());
  }
}
