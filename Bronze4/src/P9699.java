import java.util.Scanner;

public class P9699 {
  private static final int NUM_OF_RICE_SACKS = 5;

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();

    for (int i = 1; i <= testCase; i++) {
      int max = 0;
      for (int j = 0; j < NUM_OF_RICE_SACKS; j++) {
        int weight = scanner.nextInt();
        if (weight > max) max = weight;
      }

      System.out.printf("Case #%d: %d\n", i, max);
    }
  }
}
