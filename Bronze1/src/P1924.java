import java.util.Scanner;

public class P1924 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int month = scanner.nextInt();
    int day = scanner.nextInt();

    for (int i = 1; i < month; i++) {
      switch (i) {
        case 1, 3, 5, 7, 8, 10, 12:
          day += 31;
          break;

        case 4, 6, 9, 11:
          day += 30;
          break;

        case 2:
          day += 28;
          break;

        default:
          break;
      }
    }

    day %= 7;
    switch (day) {
      case 0:
        System.out.println("SUN");
        break;

      case 1:
        System.out.println("MON");
        break;

      case 2:
        System.out.println("TUE");
        break;

      case 3:
        System.out.println("WED");
        break;

      case 4:
        System.out.println("THU");
        break;

      case 5:
        System.out.println("FRI");
        break;

      case 6:
        System.out.println("SAT");
        break;
    }
  }
}
