public class Cat {
  private String name;
  private int age;

  private Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static Builder builder() {
    return new Builder();
  }

  // Encapsulation -> Builder Patterns
  // Shadow Builder (Easy to readable when new a cat)
  public static class Builder {
    private String name;
    private int age;

    // setter
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    // setter
    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Cat build() {
      return new Cat(this.name, this.age);
    }
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    Cat c1 = Cat.builder() // return Builder Obj
        .name("Tom") // return Builder Obj
        .age(18) // return Builder Obj
        .build(); //return Cat Obj

    System.out.println(c1.getName());
  }

}
