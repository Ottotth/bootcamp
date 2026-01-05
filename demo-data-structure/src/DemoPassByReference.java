public class DemoPassByReference {
  
  // Array (Pass by reference)
  // Pass by value : All Primitives , String , All Wapper Class
  // Pass by reference : Array , All other class

  
  public int sum(int x , int y){
    return x+y;
  }

  public void abc(int[] arr){
  

  }


  public static void main(String[] args) {

    int[] abc = new int[]{1,2,3,4};
    int[] def = abc;
    def[1] = 10;
    System.out.println(abc[1]);

    int x = 10;
    int y = x;
    y =20 ;
    
    System.out.println(x);
    
  }
}
