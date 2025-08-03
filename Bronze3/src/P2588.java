import java.util.Scanner;

public class P2588 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    int[] results = new int[3];
    String[] n2 = new StringBuffer(String.valueOf(num2)).reverse().toString().split("");
    for (int i = 0; i < results.length; i++) {
      results[i] = num1 * Integer.parseInt(n2[i]);
    }

    for (int result : results) {
      System.out.println(result);
    }

    int pointer = 1;
    int result4 = 0;
    for (int result : results) {
      result4 += result * pointer;
      pointer *= 10;
    }

    System.out.println(result4);
  }
}
