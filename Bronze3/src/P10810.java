import java.util.Scanner;

public class P10810 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int[] bucket = new int[scanner.nextInt()];
    int testCase = scanner.nextInt();

    for (int i = 0; i < testCase; i++) {
      int n = scanner.nextInt() - 1;
      int m = scanner.nextInt() - 1;
      int ball = scanner.nextInt();

      for (int j = n; j <= m; j++) {
        bucket[j] = ball;
      }
    }

    for (int i : bucket) {
      System.out.print(i + " ");
    }
  }
}
