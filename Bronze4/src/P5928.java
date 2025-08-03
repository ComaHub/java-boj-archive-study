import java.util.Scanner;

public class P5928 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int day = scanner.nextInt();
    int hour = scanner.nextInt();
    int minute = scanner.nextInt();

    int result = 0;
    if (day < 11 || day > 14) {
      System.out.println(-1);
      return;
    }

    if (day == 11 && hour < 11) {
      System.out.println(-1);
      return;
    }

    if (day == 11 && hour == 11 && minute < 11) {
      System.out.println(-1);
      return;
    }

    if (minute < 11) {
      hour--;
      minute += 60;
    }

    result += minute - 11;

    if (hour < 11) {
      day--;
      hour += 24;
    }

    result += (hour - 11) * 60;
    result += (day - 11) * 24 * 60;

    System.out.println(result);
  }
}
