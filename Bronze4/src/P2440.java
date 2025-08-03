import java.util.Scanner;

public class P2440 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num - i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
