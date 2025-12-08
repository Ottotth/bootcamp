public class DemoIf {
  public static void main(String[] args) {
    int x = 17;
    if (x < 4) {
      System.out.println("x < 4");
    } else {
      System.out.println("x > 4");
    }

    // if + else if + else
    int score = 75;
    if (score >= 90) {
      System.out.println("A");
    } else if (score >= 70) {
      System.out.println("B");
    } else if (score >= 50) {
      System.out.println("C");
    } else {
      System.out.println("Fail");
    }

    int w = 1025;
    if (w < 103) {
      System.out.println("w < 103");
    } else if (w >= 103 && w <= 110) {
      System.out.println("DEF");
    } else {
      System.out.println("XYZ");
    }

    // And operator &&
    // Or operator ||
    int age = 12;
    char gender = 'F';
    boolean isMale = gender == 'M';

    if (age >= 18 || isMale) {
      System.out.println("A");
    } else {
      System.out.println("B");
    }

    String name = "Otto";
    if (name.length() > 5) {
      System.out.println("Long name");
    } else {
      System.out.println("Short name");
    }

    if (name.equals("Otto")) {
      System.out.println("Same name with me!");
    } else {
      System.out.println("Hi " + name);
    }

    if (name.charAt(0) == 'J') {
      System.out.println("Yes");
    } else {
      System.out.println("Your name is start with " + name.charAt(0));
    }

    // Switch it like else if
    // should add break; at the end of each case
    char grade = 'J';
    switch (grade) {
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Fair");
        break;
      default:
        System.out.println("Poor");
    }

  }
}
