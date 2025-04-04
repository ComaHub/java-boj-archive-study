import java.util.Scanner;

public class P2444 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();

    for (int i = 1; i <= (2 * num - 1); i++) {
      if (i <= num) {
        for (int j = 1; j <= (2 * num - 1); j++) {
          if (j <= (num - i) || j >= (num + i)) {
            if (j < num) {
              System.out.print(" ");
            }
          } else {
            System.out.print("*");
          }
        }

        System.out.println();
      } else {
        for (int j = 1; j <= (2 * num - 1); j++) {
          if (j > (i - num) && j < (2 * num - (i - num))) {
            System.out.print("*");
          } else {
            if (j < num) {
              System.out.print(" ");
            }
          }
        }

        System.out.println();
      }
    }
  }
}
