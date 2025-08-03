import java.util.Scanner;

public class P2530 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int hour = scanner.nextInt();
    int minute = scanner.nextInt();
    int second = scanner.nextInt();

    second += scanner.nextInt();
    while (hour >= 24 || minute >= 60 || second >= 60) {
      if (second >= 60) {
        second -= 60;
        minute++;
      }

      if (minute >= 60) {
        minute -= 60;
        hour++;
      }

      if (hour >= 24) {
        hour -= 24;
      }
    }

    System.out.println(hour + " " + minute + " " + second);
  }
}
