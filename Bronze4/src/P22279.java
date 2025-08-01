import java.util.Scanner;

public class P22279 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = scanner.nextInt();

      double result = 0;
      for (int i = 0; i < testCase; i++) {
        double qol = scanner.nextDouble();
        double period = scanner.nextDouble();

        result += (qol * period);
      }

      System.out.println(result);
    }
  }
}
