import java.util.Scanner;

public class P9295 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = scanner.nextInt();

      for (int i = 0; i < testCase; i++) {
        System.out.printf("Case %d: %d\n", i + 1, scanner.nextInt() + scanner.nextInt());
      }
    }
  }
}
