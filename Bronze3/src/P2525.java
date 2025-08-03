import java.util.Scanner;

public class P2525 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int hour = scanner.nextInt();
    int minute = scanner.nextInt();

    minute += scanner.nextInt();
    while (minute >= 60 || hour >= 24) {
      if (minute >= 60) {
        minute -= 60;
        hour++;
      }

      if (hour >= 24) {
        hour -= 24;
      }
    }

    System.out.println(hour + " " + minute);
  }
}
