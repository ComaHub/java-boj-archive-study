import java.util.Scanner;

public class P27959 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();

    if ((100 * n) > m) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
