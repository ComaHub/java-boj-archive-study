import java.util.Scanner;

public class P2163 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int result = 0;
    if (n > m) {
      result += (m - 1) + (m * (n - 1));
    } else {
      result += (n - 1) + (n * (m - 1));
    }

    System.out.println(result);
  }
}
