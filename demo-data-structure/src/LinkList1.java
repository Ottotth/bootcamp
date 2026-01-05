public class LinkList1 {
  private Node head;



  public Node getHead() {
    return this.head;
  }

  public void add(String name) {
    if (head == null) {
      head = new Node(name);
    } else {
      Node temp = head;
      while (!(temp.getNext() == null)) {
        temp = temp.getNext();
      }
      temp.setNext(new Node(name));
    }
  }

  public boolean isEmpty() {
    if (head == null) {
      return true;
    } else
      return false;
  }

  public boolean contains(String name) {
    Node temp = this.head;
    while (!(temp == null)) {
      if (temp.toString().equals(name))
        return true;
      temp = temp.getNext();
    }
    return false;
  }

  public void remove(Node node) {
    if (head.toString().equals(node.toString())) {
      head = node;
    } else {
      Node temp = head;
      while (temp != null && temp.getNext()!= null) {
        if (temp.getNext().toString().equals(node.toString())) {
          if(temp.getNext().getNext() == null) temp.getNext().setNext(null);
          temp.setNext(temp.getNext().getNext());
          break;
        }
        temp = temp.getNext();
      }
    }
  }

  public int size(){
    Node temp = head;
    int count = 0;
    while (temp != null){
      temp = temp.getNext();
      count++;
    }
    return count; 
  }


  public static void main(String[] args) {
    LinkList1 list1 = new LinkList1();
    list1.add("banana");
    list1.add("asdasd");
    list1.add("bbb");
    list1.add("ccc");
    list1.add("cc222c");

    System.out.println(list1.getHead().getNext().getNext());
    System.out.println(list1.contains("banana"));

    list1.remove(new Node("bbb"));
    System.out.println("123");
    System.out.println(list1.getHead().getNext().getNext());
    System.out.println(list1.size());
    list1.remove(new Node("cc222c"));
    System.out.println(list1.size());



  }



}
