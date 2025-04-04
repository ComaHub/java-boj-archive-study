import java.util.Scanner;

public class P1978 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[scanner.nextInt()];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }

    int count = 0;
    for (int number : numbers) {
      boolean isPrime = true;
      if (number == 1) isPrime = false;

      for (int i = 2; i <= (number / 2); i++) {
        if (number % i == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) count++;
    }

    System.out.println(count);
  }
}
