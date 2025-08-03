import java.math.BigInteger;
import java.util.Scanner;

public class P1010 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    for (int i = 0; i < testCase; i++) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();

      String result = factorial(m).divide(factorial(m - n)).divide(factorial(n)).toString();
      System.out.println(result);
    }
  }

  public static BigInteger factorial(int num) {
    BigInteger result = new BigInteger("1");
    for (int i = 2; i <= num; i++) {
      result = result.multiply(new BigInteger(i + ""));
    }

    return result;
  }
}
