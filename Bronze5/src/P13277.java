import java.math.BigInteger;
import java.util.Scanner;

public class P13277 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    BigInteger num1 = scanner.nextBigInteger();
    BigInteger num2 = scanner.nextBigInteger();

    BigInteger result = num1.multiply(num2);
    System.out.println(result);
  }
}