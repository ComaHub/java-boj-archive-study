import java.util.Scanner;

public class P25304 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int checkPrice = scanner.nextInt();
    int bucketList = scanner.nextInt();

    int priceSum = 0;
    for (int i = 0; i < bucketList; i++) {
      priceSum += scanner.nextInt() * scanner.nextInt();
    }

    if (checkPrice == priceSum) System.out.println("Yes");
    else System.out.println("No");
  }
}
