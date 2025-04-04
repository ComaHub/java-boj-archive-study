import java.math.BigInteger;
import java.util.Scanner;

public class P1271 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    BigInteger money = scanner.nextBigInteger();
    BigInteger people = scanner.nextBigInteger();

    System.out.println(money.divide(people));
    System.out.println(money.remainder(people));
  }
}
