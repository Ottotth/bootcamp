import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoLambda {
  //

  public static void main(String[] args) {
    // After Java 8 :Lambda Expression
    // Functional Interface (One Method Interface)

    // Java Build-in Lambda Function
    // 1.Funtion (method: input -> output)

    // Compile time confirm the type of Function(Input:String -> Output Integer)
    Function<String, Integer> stringLengthFormula = s -> s.length();
    stringLengthFormula.apply("hello");

    // Lambda Expression: Write a fomula(java method) for Object, call the only method inside object

    Function<ArrayList<?>, Integer> f = list -> list.size();
    ArrayList<Integer> al = new ArrayList<>();
    al.add(2);
    al.add(4);
    al.add(33);
    int x = f.apply(al);
    System.out.println(x);


    Function<String, String> trimAndUpperCase3 =
        new Function<String, String>() {
          @Override
          public String apply(String s) {
            return s.trim().toUpperCase();
          }
        };
    System.out.println(trimAndUpperCase3.apply("hello"));

    // 2.BiFunction
    BiFunction<String, Integer, Character> ff =
        (String s, Integer i) -> s.charAt(i);
    System.out.println(ff.apply("Hello", 2));

    // 3.Custom Functional Interface
    MathOperation add = (a, b) -> a + b;
    MathOperation multi = (a, b) -> a * b;
    MathOperation sub = (a, b) -> a - b;
    System.out.println(add.operate(10, 5));
    System.out.println(multi.operate(10, 5));
    System.err.println(sub.operate(10, 5));

    // 4.Consumer (have input, but no output ) void method
    List<String> names = new ArrayList<>();
    names.add("john");
    names.add("mary");
    names.add("peter");
    // normal for each loop
    for (String name : names) {
      System.out.println(name);
    }
    // foreach()
    Consumer<String> printOut = s -> System.out.println(s);
    names.forEach(printOut);
    // Short ver foreach()
    names.forEach(s -> System.out.println(s));
    // With{}, can use more than one line , and need to use "return" if required
    names.forEach(s -> {
      System.out.print(s);
      System.out.print(" , Hello! \n");
    });

    // 5. Supplier (no input, but with output)
    Supplier<Integer> markSixGenerator = () -> new Random().nextInt(49) + 1;
    for (int i = 0; i < 6; i++) {
      System.out.print(markSixGenerator.get() + " , ");
    }
    System.out.println();

    // 6. Predicate
    Predicate<Person> isElderly = p -> p.isElderly();
    System.out.println(isElderly.test(new Person(77))); // true
    System.out.println(isElderly.test(new Person(60))); // false

    // BiConsumer , BiPredicate

    // Example: Map
    Map<Integer, String> studentMap = new HashMap<>();
    studentMap.put(101, "Mary");
    studentMap.put(102, "Tom");
    studentMap.put(103, "Peter");
    // if stuNum is null , put value "N/A" in that stuNum key
    studentMap.computeIfAbsent(102, stuNum -> "N/A");
    System.out.println(studentMap);
    studentMap.computeIfAbsent(104, stuNum -> "N/A");
    System.out.println(studentMap);

    studentMap.forEach((k, v) -> System.out.println("key=" + k + " , " + v));
    
  }

}
