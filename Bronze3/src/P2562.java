import java.util.Scanner;

public class P2562 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[9];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }

    int max = 0;
    int maxIndex = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
        maxIndex = i + 1;
      }
    }

    System.out.println(max);
    System.out.println(maxIndex);
  }
}
