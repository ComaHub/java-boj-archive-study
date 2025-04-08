import java.util.Scanner;

public class P5717 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      int m = scanner.nextInt();
      int f = scanner.nextInt();

      if (m == 0 && f == 0) break;

      System.out.println(m + f);
    }
  }
}
