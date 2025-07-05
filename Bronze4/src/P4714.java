import java.util.Scanner;

public class P4714 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      double height = scanner.nextDouble();
      if (height == -1.0) break;

      System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", height, (height * 0.167));
    }
  }
}
