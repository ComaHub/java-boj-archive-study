import java.util.Scanner;

public class P2480 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[3];
    int max = 0;
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }

    if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
      System.out.println(10000 + (numbers[0] * 1000));
    } else if (numbers[0] == numbers[1]) {
      System.out.println(1000 + (numbers[0] * 100));
    } else if (numbers[0] == numbers[2]) {
      System.out.println(1000 + (numbers[0] * 100));
    } else if (numbers[1] == numbers[2]) {
      System.out.println(1000 + (numbers[1] * 100));
    } else {
      System.out.println(max * 100);
    }
  }
}
