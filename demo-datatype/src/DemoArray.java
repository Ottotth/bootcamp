public class DemoArray {
  public static void main(String[] args) {
    /* problem
    int x = 1;
    int x2 = 2;
    int x3 = 3;
    */
   
    // Solution: Array : Store multiple values in same datatype
    int[] numbersArr = new int[3]; // 3 places to store int value (0 1 2)
    numbersArr[0] = 1;
    numbersArr[1] = 2;
    numbersArr[2] = 3;

    // read value from array
    System.out.println(numbersArr[0]);

    // print all values in array
    for (int i = 0; i < numbersArr.length; i++) {
      System.out.println(numbersArr[i]);
    }

    double[] doubleArr = new double[4];
    doubleArr[0] = 1.1;
    doubleArr[1] = 9.2;
    doubleArr[2] = -9.8;
    doubleArr[3] = 77.9;
    for (int i = 0; i < doubleArr.length; i++) {
      System.out.println(doubleArr[i]);
    }
  }
}


