public class Order {
  private int id;
  private String item;

  public Order(int id , String item){
    this.id = id;
    this.item = item;
  }

  public String getInfo(){
    return "id:" + this.id + " | item:" + this.item;
  }
}
