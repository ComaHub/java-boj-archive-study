import java.util.Scanner;

public class P1002 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    for (int i = 0; i < testCase; i++) {
      int joX = scanner.nextInt();
      int joY = scanner.nextInt();
      int joR = scanner.nextInt();

      int baX = scanner.nextInt();
      int baY = scanner.nextInt();
      int baR = scanner.nextInt();

      int joToBa2 = ((joX - baX) * (joX - baX)) + ((joY - baY) * (joY - baY));

      if (joX == baX && joY == baY) {
        if (joR == baR) System.out.println(-1);
        else System.out.println(0);

        continue;
      }

      if ((joR * joR) < joToBa2 && (baR * baR) < joToBa2) {
        if ((joR + baR) * (joR + baR) > joToBa2) System.out.println(2);
        else if ((joR + baR) * (joR + baR) < joToBa2) System.out.println(0);
        else System.out.println(1);
      } else {
        if ((joR - baR) * (joR - baR) > joToBa2) System.out.println(0);
        else if ((joR - baR) * (joR - baR) < joToBa2) System.out.println(2);
        else System.out.println(1);
      }
    }
  }
}
