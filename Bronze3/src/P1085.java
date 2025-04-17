import java.util.Scanner;

public class P1085 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] point = new int[4]; // x, y, w, h
    for (int i = 0; i < point.length; i++) {
      point[i] = scanner.nextInt();
    }

    point[2] -= point[0];
    point[3] -= point[1];

    int min = 1001;
    for (int i : point) {
      if (min > i) min = i;
    }

    System.out.println(min);
  }
}
