import java.util.Scanner;

public class P32684 {
  public static void main(String[] args) {
    int[] points = new int[] {13, 7, 5, 3, 3, 2};

    try (Scanner scanner = new Scanner(System.in)) {
      double choPoint = 0;
      for (int i = 0; i < 6; i++) {
        choPoint += scanner.nextInt() * points[i];
      }

      double hanPoint = 1.5;
      for (int i = 0; i < 6; i++) {
        hanPoint += scanner.nextInt() * points[i];
      }

      if (choPoint > hanPoint) System.out.println("cocjr0208");
      else System.out.println("ekwoo");
    }
  }
}
