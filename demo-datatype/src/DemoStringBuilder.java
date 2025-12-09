public class DemoStringBuilder {
  public static void main(String[] args) {
    //StringBuilder > Change itself
    StringBuilder sb = new StringBuilder(); //deflaut empty string
    sb.append("abc");
    System.out.println(sb);
    sb.append("hello");
    System.out.println(sb);

    // normal String not change itself , need one more var
    String s = "hello";
    String s2 = s.concat("!!!");
    System.out.println(s2);

    // compare StringBuilder And String
    long before = System.currentTimeMillis();
    String x = "";
    for(int i = 0 ; i <100000 ; i++){
      x += "a";
    }
    System.out.println(x.length());
    long end = System.currentTimeMillis();
    System.out.println(end - before);

    long before2 = System.currentTimeMillis();
    StringBuilder sbb = new StringBuilder();
    for(int i = 0 ; i <100000 ; i++){
      sbb.append("a");
    }
    System.out.println(sbb.length());
    long end2 = System.currentTimeMillis();
    System.out.println(end2 - before2);
    
    //Other Methods
    System.out.println(sb.length());
    System.out.println(sb.isEmpty());
    System.out.println(sb.indexOf("b"));

    //reverse
    String input = "hello";
    String reversed = new StringBuilder(input).reverse().toString();
    System.out.println(reversed);

    //Delete CharAt
    StringBuilder sb3 = new StringBuilder("whatupp");
    sb3.deleteCharAt(3);
    System.out.println(sb3); //whaupp
    
    
  }
  
}
