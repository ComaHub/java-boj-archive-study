import java.util.Scanner;

public class P28248 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int successDelivery = scanner.nextInt();
    int crashCount = scanner.nextInt();

    int sum = (successDelivery * 50) - (crashCount * 10);
    if (successDelivery > crashCount) sum += 500;

    System.out.println(sum);
  }
}
