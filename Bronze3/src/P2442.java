import java.util.Scanner;

public class P2442 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= (num - i); j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= ((2 * i) - 1); j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
