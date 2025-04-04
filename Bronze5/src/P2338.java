import java.math.BigInteger;
import java.util.Scanner;

public class P2338 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    BigInteger bigA = scanner.nextBigInteger();
    BigInteger bigB = scanner.nextBigInteger();

    System.out.println(bigA.add(bigB));
    System.out.println(bigA.subtract(bigB));
    System.out.println(bigA.multiply(bigB));
  }
}
