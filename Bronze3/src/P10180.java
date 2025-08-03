import java.util.Scanner;

public class P10180 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    for (int i = 0; i < testCase; i++) {
      int ship = scanner.nextInt();
      int distance = scanner.nextInt();
      int count = 0;

      for (int j = 0; j < ship; j++) {
        int speed = scanner.nextInt();
        int fuel = scanner.nextInt();
        int consumePerHour = scanner.nextInt();

        double fullHour = (double) fuel / consumePerHour;
        double myDistance = fullHour * speed;

        if (myDistance >= distance) {
          count++;
        }
      }

      System.out.println(count);
    }
  }
}
