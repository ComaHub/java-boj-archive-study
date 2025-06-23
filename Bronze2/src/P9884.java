import java.util.Scanner;

public class P9884 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numA = scanner.nextInt();
    int numB = scanner.nextInt();

    System.out.println(gcd(numA, numB));
  }

  static int gcd(int numA, int numB) {
    while (true) {
      if (numA == numB) break;

      int numATemp = Math.max(numA, numB) - Math.min(numA, numB);
      int numBTemp = Math.min(numA, numB);

      numA = numATemp;
      numB = numBTemp;
    }

    return numA;
  }
}
