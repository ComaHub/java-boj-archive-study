import java.util.Scanner;

public class P7595 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        int input = scanner.nextInt();
        if (input == 0) break;

        makeTriangle(input);
      }
    }
  }

  private static void makeTriangle(int num) {
    for (int i = 0; i < num; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
