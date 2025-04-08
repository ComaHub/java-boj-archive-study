import java.util.Scanner;

public class P1436 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int count = 0;
    int point = 1;
    while (true) {
      if (String.valueOf(point).contains("666")) {
        count++;
      }

      if (count == n) {
        System.out.println(point);
        break;
      }

      point++;
    }
  }
}
