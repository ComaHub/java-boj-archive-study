import java.util.Scanner;

public class P2798 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[scanner.nextInt()];
    int m = scanner.nextInt();
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }

    int result = 0;
    for (int i = 0; i < numbers.length - 2; i++) {
      for (int j = i + 1; j < numbers.length - 1; j++) {
        for (int k = j + 1; k < numbers.length; k++) {
          int sum = numbers[i] + numbers[j] + numbers[k];
          if (sum > m) continue;
          if (sum > result) result = sum;
        }
      }
    }

    System.out.println(result);
  }
}