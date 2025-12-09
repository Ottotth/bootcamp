import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    /*
     * problem int x = 1; int x2 = 2; int x3 = 3;
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

    // for loop + if (filtering)
    // find the string length > 5
    String[] stringArr = new String[3];
    stringArr[0] = "Apple";
    stringArr[1] = "Banana";
    stringArr[2] = "Coconut";

    for (int i = 0; stringArr.length > i; i++) {
      if (stringArr[i].length() > 5) {
        System.out.println(stringArr[i] + " length > 5");
      }
    }
    // print the string length > 5 && start with 'B'
    for (int i = 0; stringArr.length > i; i++) {
      if (stringArr[i].length() > 5 && stringArr[i].startsWith("B")) {
        System.out.println("BBB");
      } else {
        System.out.println("noB");
      }
    }
    int[] arr5 = new int[] {5, 3, 100, -200, 87};
    int biggest = 0;
    for (int i = 0; arr5.length > i; i++) {
      if (arr5[i] > biggest) {
        biggest = arr5[i];
      }
    }
    System.out.println(biggest);

    // swap
    int a = 6;
    int b = 8;
    int swap;
    swap = a;
    a = b;
    b = swap;
    System.out.println(a + "|" + b);

    int[] arr6 = new int[] {1, 10, 52, 6, 2, 3};
    // move biggest to the back
    int backup = arr6[0];
    for (int i = 0; arr6.length - 1 > i; i++) {
      if (arr6[i] > arr6[i + 1]) {
        backup = arr6[i];
        arr6[i] = arr6[i + 1];
        arr6[i + 1] = backup;
      }
    }
    System.out.println(arr6[5]);

    arr6 = new int[] {1, 10, 52, 6, 2, 3};
    // Sorting
    for (int i = 0; i < arr6.length - 1; i++) {
      for (int j = 0; j < arr6.length - 1 - i; j++) {
        if (arr6[j] > arr6[j + 1]) {
          backup = arr6[j];
          arr6[j] = arr6[j + 1];
          arr6[j + 1] = backup;
        }
      }
    }
    System.out.println(Arrays.toString(arr6));
  }

}


