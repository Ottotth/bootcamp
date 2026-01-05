import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BallA implements Comparable<BallA> {
  private Color color;

  public BallA(Color color) {
    this.color = color;
  }

  public enum Color {
    RED, BLUE, YELLOW
  }

  // this.ball vs o.ball
  @Override
  public int compareTo(BallA o) {
    // return this (-1)
    // return o 1
    if (o.color == Color.RED) {
      if (this.color == Color.RED) {
        return 0;
      } else {
        return 1;
      }
    } else if (o.color == Color.BLUE) {
      if (this.color == Color.RED) {
        return -1;
      } else if (this.color == Color.BLUE) {
        return 0;
      } else {
        return 1;
      }
    } else { // o.color == YELLOW
      if (this.color == Color.YELLOW) {
        return 0;
      } else {
        return -1;
      }
    }
  }

  @Override
  public String toString() {
    return "BallA{" +
        "color=" + color +
        '}';
  }

  public static void main(String[] args) {
    int[] arr = new int[] {4, 9, 2, 7, 5};
    Arrays.sort(arr); // pass by reference , Primitive (ususally use for number)
    System.out.println(Arrays.toString(arr));

    // Collection.sort(); // Object (ususally use for Object)
    // HashSey -> add() -> Object.equals()
    List<BallA> balls = new ArrayList<>();
    balls.addAll(Arrays.asList(new BallA(Color.BLUE), new BallA(Color.RED),
        new BallA(Color.YELLOW), new BallA(Color.BLUE), new BallA(Color.RED),
        new BallA(Color.YELLOW)));

      

    System.out.println(balls);
  }
}
