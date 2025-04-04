import java.util.Scanner;

public class P10250 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    for (int i = 0; i < testCase; i++) {
      int h = scanner.nextInt();
      int w = scanner.nextInt();
      int n = scanner.nextInt();

      String floor = String.valueOf((n % h != 0) ? (n % h) : h);
      String number = String.valueOf((n % h != 0) ? (n / h) + 1 : (n / h));
      String room;
      if (number.length() == 1) {
        room = floor + "0" + number;
      } else {
        room = floor + number;
      }

      System.out.println(room);
    }
  }
}
