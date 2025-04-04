import java.util.Scanner;

public class P11021 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();

    for (int i = 1; i <= testCase; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      System.out.println("Case #" + i + ": " + (a + b));
    }
  }
}
