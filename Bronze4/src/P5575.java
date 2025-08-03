import java.util.Scanner;

public class P5575 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      int hour = scanner.nextInt();
      int minute = scanner.nextInt();
      int second = scanner.nextInt();

      hour = scanner.nextInt() - hour;
      minute = scanner.nextInt() - minute;
      second = scanner.nextInt() - second;

      if (second < 0) {
        second += 60;
        minute--;
      }

      if (minute < 0) {
        minute += 60;
        hour--;
      }

      System.out.printf("%d %d %d\n", hour, minute, second);
    }
  }
}
