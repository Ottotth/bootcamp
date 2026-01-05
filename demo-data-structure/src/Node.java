public class Node {
  private Node next;
  private String name;

  public Node(String name){
    this.name = name;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getNext() {
    return next;
  }
  

  @Override
  public String toString() {
  return this.name;
  }

}

