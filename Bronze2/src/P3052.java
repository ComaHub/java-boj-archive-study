import java.util.Scanner;

public class P3052 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[10];
    int[] results = new int[10];
    int count = 0;

    for (int i = 0; i < 10; i++) {
      numbers[i] = scanner.nextInt();
    }

    for (int number : numbers) {
      int remain = number % 42;
      boolean isExist = false;

      for (int i = 0; i < count; i++) {
        if (remain == results[i]) {
          isExist = true;
        }
      }

      if (!isExist) {
        results[count] = remain;
        count++;
      }
    }

    System.out.println(count);
  }
}
