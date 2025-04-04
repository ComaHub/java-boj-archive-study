import java.math.BigInteger;
import java.util.Scanner;

public class P22193 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();

    BigInteger numA = scanner.nextBigInteger();
    BigInteger numB = scanner.nextBigInteger();

    System.out.println(numA.multiply(numB));
  }
}
