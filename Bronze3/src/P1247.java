import java.math.BigInteger;
import java.util.Scanner;

public class P1247 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      BigInteger sum = new BigInteger("0");
      int numbers = Integer.parseInt(scanner.nextLine());
      for (int j = 0; j < numbers; j++) {
        sum = sum.add(new BigInteger(scanner.nextLine()));
      }

      if (sum.compareTo(new BigInteger("0")) > 0) {
        System.out.println("+");
      } else if (sum.compareTo(new BigInteger("0")) < 0) {
        System.out.println("-");
      } else System.out.println("0");
    }

  }
}