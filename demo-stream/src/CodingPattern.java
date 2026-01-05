public class CodingPattern {
  public static void main(String[] args) {
    // Singleton 範例
    System.out.println("Singleton: " + Singleton.getInstance().value);

    // Factory 範例
    Animal cat = AnimalFactory.create("cat");
    System.out.println("Factory: " + cat.speak());

    // Strategy 範例（用 functional interface + lambda）
    MathStrategy add = (a, b) -> a + b;
    MathStrategy mul = (a, b) -> a * b;
    System.out.println("Strategy add: " + add.execute(2, 3));
    System.out.println("Strategy mul: " + mul.execute(2, 3));

    // Builder 範例
    User user = new User.Builder("alice").age(30).email("a@b.c").build();
    System.out.println("Builder: " + user);

    // Observer 範例（簡單的 listener list）
    Subject subj = new Subject();
    subj.addListener(msg -> System.out.println("Listener1 got: " + msg));
    subj.addListener(msg -> System.out.println("Listener2 got: " + msg));
    subj.notifyAllListeners("hello observers");
  }

  // ---- Singleton ----
  static class Singleton {
    public final String value = "唯一實例";
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
      return INSTANCE;
    }
  }

  // ---- Factory ----
  interface Animal {
    String speak();
  }
  static class Cat implements Animal {
    public String speak() {
      return "meow";
    }
  }
  static class Dog implements Animal {
    public String speak() {
      return "woof";
    }
  }
  static class AnimalFactory {
    static Animal create(String type) {
      switch (type.toLowerCase()) {
        case "cat":
          return new Cat();
        case "dog":
          return new Dog();
        default:
          throw new IllegalArgumentException("unknown: " + type);
      }
    }
  }

  // ---- Strategy (functional interface) ----
  @FunctionalInterface
  interface MathStrategy {
    int execute(int a, int b);
  }

  // ---- Builder ----
  static class User {
    private final String name;
    private final int age;
    private final String email;

    private User(Builder b) {
      this.name = b.name;
      this.age = b.age;
      this.email = b.email;
    }

    public static class Builder {
      private final String name;
      private int age = 0;
      private String email = "";

      public Builder(String name) {
        this.name = name;
      }

      public Builder age(int a) {
        this.age = a;
        return this;
      }

      public Builder email(String e) {
        this.email = e;
        return this;
      }

      public User build() {
        return new User(this);
      }
    }

    public String toString() {
      return name + " age=" + age + " email=" + email;
    }
  }

  // ---- Observer (簡單版) ----
  @FunctionalInterface
  interface Listener {
    void onMessage(String msg);
  }
  static class Subject {
    private final java.util.List<Listener> listeners =
        new java.util.ArrayList<>();

    void addListener(Listener l) {
      listeners.add(l);
    }

    void notifyAllListeners(String msg) {
      listeners.forEach(l -> l.onMessage(msg));
    }
  }

}
