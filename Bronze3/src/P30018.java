import java.util.Scanner;

public class P30018 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int servicePoint = scanner.nextInt();

    int[] beforeService = new int[servicePoint];
    for (int i = 0; i < servicePoint; i++) {
      beforeService[i] = scanner.nextInt();
    }

    int[] afterService = new int[servicePoint];
    for (int i = 0; i < servicePoint; i++) {
      afterService[i] = scanner.nextInt();
    }

    int count = 0;
    for (int i = 0; i < servicePoint; i++) {
      count += Math.abs(beforeService[i] - afterService[i]);
    }

    System.out.println(count / 2);
  }
}
