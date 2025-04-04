import java.util.Scanner;

public class P18247 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int MIN_COLUMN = 12;
    int MIN_SEAT = 4;

    int testCase = scanner.nextInt();

    for (int i = 0; i < testCase; i++) {
      int columns = scanner.nextInt();
      int seats = scanner.nextInt();

      if (columns < MIN_COLUMN || seats < MIN_SEAT) {
        System.out.println(-1);
      } else {
        int mySeatNum = (((MIN_COLUMN - 1) * seats) + MIN_SEAT);
        System.out.println(mySeatNum);
      }
    }
  }
}
