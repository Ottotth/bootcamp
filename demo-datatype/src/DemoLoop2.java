public class DemoLoop2 {

  public static void main(String[] args) {
    // while loop
    // for loop
    String s ="hello";
    for (int i =0 ; i < 10 ; i++) {
      System.out.println(s);
    }
    int j = 0;
    while (j < 3) {
      j++;
      System.out.println("yoyo");
    }

    // for-each (print out all the array) go though all once
    //only read
    char[] chs = s.toCharArray();//Hello to array
    for(char ch:chs) {
      System.out.println(ch);
    }

    int[] intarr = new int[] {2,4,3};
    for (int x : intarr){
      System.out.println(x);
    }

    double[] height = new double[]{32.4,555.5,45,192,434,4};
    for (double h : height){
      System.out.println(h);
    } 

    int t = 0;
    //do while (at least to the loop Once
    do { 
    System.out.println("123");
    t++;
  } while (t < 5); 

  //String merhod split()
  String email = "Dear Sir, Hello";
  String[] word = email.split(" ");
  for (String ww : word ) {
    System.out.println(ww);
  }
     

      
    
    



  }
  
}
