import java.util.Scanner;

public class P2420 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long n = scanner.nextLong();
    long m = scanner.nextLong();

    long result = n - m;
    if (result < 0) {
      result *= -1;
    }

    System.out.println(result);
  }
}
