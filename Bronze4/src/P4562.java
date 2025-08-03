import java.util.Scanner;

public class P4562 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    for (int i = 0; i < testCase; i++) {
      if (scanner.nextInt() >= scanner.nextInt()) {
        System.out.println("MMM BRAINS");
      } else {
        System.out.println("NO BRAINS");
      }
    }
  }
}
