import java.math.BigInteger;
import java.util.Scanner;

public class P15829 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] seq = new int[scanner.nextInt()];
    scanner.nextLine(); // \n 제거

    String word = scanner.nextLine();
    for (int i = 0; i < word.length(); i++) {
      seq[i] = word.charAt(i) - 96;
    }

    BigInteger r = new BigInteger("1");
    BigInteger rValue = new BigInteger("31");
    BigInteger sum = new BigInteger("0");
    for (int i : seq) {
      sum = sum.add(r.multiply(new BigInteger(String.valueOf(i))));
      r = r.multiply(rValue);
    }

    System.out.println(sum.remainder(new BigInteger("1234567891")));
  }
}
