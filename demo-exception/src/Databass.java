package src;

import java.util.ArrayList;
import java.util.List;

public class Databass<T> {
  private List<T> value;

  public Databass() {
    this.value = new ArrayList<>();
  }

  public boolean add(T s) {
    return this.value.add(s);
  }

  public boolean remove(T s) {
    return this.value.remove(s);
  }

  public boolean search(T s) {
    if (!this.value.contains(s)) {
      try {
        throw BussinessException.of(SysCode.USERNAME_NOT_FOUND);
      } catch (BussinessException e) {
        System.out.println(
            "Caught BussinessException: " + e.getMessage() + ", code: " + e.getCode());
        return false;
      }
    }
    return true;
  }

  public List<T> getAll() {
    return this.value;
  }

  public static void main(String[] args) {
    Databass<String> usernames = new Databass<>();
    usernames.add("alice");
    usernames.add("bob");
    usernames.add("charlie");
    usernames.search("otto");
    
  }
}
