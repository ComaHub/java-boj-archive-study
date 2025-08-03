import java.math.BigInteger;
import java.util.Scanner;

public class P15740 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    BigInteger numA = scanner.nextBigInteger();
    BigInteger numB = scanner.nextBigInteger();

    System.out.println(numA.add(numB));
  }
}
