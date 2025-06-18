import java.util.Scanner;

public class P9095 {
  static int count = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    for (int i = 0; i < testCase; i++) {
      count = 0;
      sep123(scanner.nextInt());
      System.out.println(count);
    }
  }

  static void sep123(int num) {
    if (num < 0) return;

    if (num == 0) {
      count++;
      return;
    }

    sep123(num - 1);
    if (num >= 2) sep123(num - 2);
    if (num >= 3) sep123(num - 3);
  }
}
