import java.util.Scanner;

public class P2884 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int hour = scanner.nextInt();
    int minute = scanner.nextInt();

    myAlarm(hour, minute);
  }

  public static void myAlarm(int hour, int minute) {
    minute -= 45;
    if (minute < 0) {
      minute += 60;
      hour--;
    }

    if (hour < 0) {
      hour += 24;
    }

    System.out.println(hour + " " + minute);
  }
}
