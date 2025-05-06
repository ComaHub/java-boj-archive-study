import java.util.Scanner;

public class P4470 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < testCase; i++) {
      System.out.printf("%d. %s\n", (i + 1), scanner.nextLine());
    }
  }
}
