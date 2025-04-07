import java.util.Scanner;

public class P2775 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    for (int i = 0; i < testCase; i++) {
      int k = scanner.nextInt();
      int n = scanner.nextInt();

      System.out.println(people(k, n));
    }
  }

  public static int people(int k, int n) {
    if (k == 0) {
      return n;
    }

    int result = 0;
    for (int i = 1; i <= n; i++) {
      result += people((k - 1), i);
    }

    return result;
  }
}
