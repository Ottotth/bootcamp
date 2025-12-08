public class DemoString {
  public static void main(String[] args) {
    // For Loop
    long x = 2;
    int times = 9;

    // for (initialization; condition; increment/decrement)
    for (int i = 0; i < times; i++) {
      x = x * 2;
      System.out.println("x = " + x + " | times = " + (i + 1));

    }

    for (int t = 0; t <= 100; t++) {
      boolean isOddNumber = (t % 2) != 0;
      if (isOddNumber == true) {
        System.out.println(t + " is odd number");
      } else {
        System.out.println(t + " is even number");
      }
    }

    String name = "David";
    for (int i = 0; i < name.length(); i++) {
      if (name.charAt(i) == 'i') {
        System.out.println("Found i at index " + (i + 1));
      }
    }

    // Function 4 : indexOf() Find the index of the first character in a string
    // lastIndexOf() Find the index of the last character in a string
    String place = "Hong Kong";
    System.out.println(place.indexOf('H'));
    System.out.println("o first index: " + place.indexOf('o'));
    System.out.println("o last index: " + place.lastIndexOf('o'));

    // Function 5 : contains() Check if a string contains a sequence of characters
    String sentence = "The quick brown fox jumps over the lazy dog.";
    System.out.println(sentence.contains("fox")); // true
    System.out.println(sentence.contains("Fox")); // false

    // Function 6 : StartsWith() and EndsWith() Check if a string starts or ends with a specific sequence of characters
    String filename = "document.pdf";
    System.out.println(filename.startsWith("Doc")); // false
    System.out.println(filename.endsWith(".pdf")); // true

    //Function 7 : isEmpty() Check if a string is empty
    String emptyString = "";
    System.out.println("Is the string empty? " + emptyString.isEmpty()); // true
    System.out.println("Is the string empty? " + name.isEmpty()); // false

    if (!name.isEmpty()) {
      System.out.println("Name is not empty, Name = " + name);
    }

    // Function 8 : concat() Concatenate two strings
    String firstName = "John";
    String lastName = "Doe";
    String fullName = firstName.concat(" " + lastName);
    System.out.println("Full Name: " + fullName);

    // Function 9 : replace() Replace occurrences of a character or substring with another character or substring
    String originalString = "I hate programming in Java.";
    System.out.println(originalString.replace("hate", "love"));

    // Function 10 : substring() Extract a substring from a string
    String str = "Hello, World!";
    String subStr = str.substring(7, 13); // "World!" 13-1
    System.out.println("Substring: " + subStr);

    //Function 11 : toUpperCase() and toLowerCase() Convert a string to uppercase or lowercase
    String mixedCase = "Java Programming";
    System.out.println("Uppercase: " + mixedCase.toUpperCase());
    System.out.println("Lowercase: " + mixedCase.toLowerCase());

    //Finction 12 : valueOf() Convert different data types to a string
    int number = 100;
    String numberStr = String.valueOf(number);  
    System.out.println("String representation of number: " + numberStr);

    //Function 13 : char[] toCharArray() Convert a string to a character array
    String sample = "Sample";
    char[] charArray = sample.toCharArray();
    System.out.println("Character Array:");
    for (char c : charArray) {
      System.out.println(c); 
    }


  }

}
