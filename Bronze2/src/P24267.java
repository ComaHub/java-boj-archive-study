import java.util.Scanner;

public class P24267 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long num = scanner.nextLong();
    long sum = 0;
    long result = 0;
    for (int i = 1; i <= num - 2; i++) {
      sum += i;
      result += sum;
    }

    System.out.println(result);
    System.out.println(3);
  }
}
