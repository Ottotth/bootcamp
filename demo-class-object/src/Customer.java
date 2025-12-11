public class Customer {
  private Order[] orders;

  public Customer(){
    this.orders = new Order[0]; 
  }

  public void addOrder(Order newOrder){
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    newOrders[newOrders.length - 1] = newOrder;
    this.orders = newOrders;

  }

  
  public static void main(String[] args) {
    Customer a = new Customer();
    a.addOrder(new Order(101, "apple"));
    a.addOrder(new Order(103, "Banana"));
    a.addOrder(new Order(108, "Car"));

    for (int i = 0 ; i < a.orders.length ; i++){
      System.out.println(a.orders[i].getInfo());
    }
    
    

  }
  
}
