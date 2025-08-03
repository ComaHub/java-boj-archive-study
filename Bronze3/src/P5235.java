import java.util.Scanner;

public class P5235 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < testCase; i++) {
      int numbers = scanner.nextInt();
      int evenSum = 0;
      int oddSum = 0;

      for (int j = 0; j < numbers; j++) {
        int number = scanner.nextInt();

        if (number % 2 == 0) {
          evenSum += number;
        } else {
          oddSum += number;
        }
      }

      if (evenSum > oddSum) System.out.println("EVEN");
      else if (evenSum < oddSum) System.out.println("ODD");
      else System.out.println("TIE");
    }
  }
}
