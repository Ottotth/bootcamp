public class Customer {
  private Order[] orders;

  public Customer() {
    this.orders = new Order[0];
  }

  public void addOrder(Order newOrder) {
    // 1. create new array with length + 1
    Order[] newOrders = new Order[this.orders.length + 1];
    // 2. put the old array to new array
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    // 3. put the new order to the last of the array
    newOrders[newOrders.length - 1] = newOrder;
    // 4. replace new array to old array
    this.orders = newOrders;

  }

  public Order getOrder(int orderId) {
    for (Order o : this.orders) {
      if (o.getId() == orderId)
        return o;
    }
    return null;
  }

public boolean isVip(){
  double total = 0;
  for(int i = 0 ; i < this.orders.length ; i++){
    total = total + orders[i].getOrderAmount();
  }
  return total >= 100000;
}

public double getOrderAmountById( int Id){
  for (Order order : this.orders) {
    if(Id == order.getId() ){
      return order.getOrderAmount();
    } 
  }
  return 0.0;
}


  public static void main(String[] args) {
    Customer a = new Customer();
    Order oo1 = new Order(12);
    Order oo2 = new Order(13);
    a.addOrder(oo1);
    a.addOrder(oo2);
    oo1.addItem(new Item(12,3));
    oo2.addItem(new Item(10000,10));
    

    System.out.println(oo1.getId());
    System.out.println(a.isVip());
    System.out.println(a.getOrderAmountById(12));

    //for (int i = 0; i < a.orders.length; i++) {
    //  System.out.println(a.orders[i].getInfo());}



  }

}
