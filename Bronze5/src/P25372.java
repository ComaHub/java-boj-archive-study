import java.util.Scanner;

public class P25372 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < testCase; i++) {
      String password = scanner.nextLine();

      if (password.length() >= 6 && password.length() <= 9) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
}
