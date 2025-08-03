import java.util.Scanner;

public class P11047 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int coin = scanner.nextInt();
    int price = scanner.nextInt();

    int[] coins = new int[coin];
    for (int i = 0; i < coins.length; i++) {
      coins[i] = scanner.nextInt();
    }

    int count = 0;
    for (int i = coins.length - 1; i >= 0; i--) {
      if (coins[i] > price) continue;

      count += price / coins[i];
      price %= coins[i];

      if (price == 0) break;
    }

    System.out.println(count);
  }
}
