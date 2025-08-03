import java.util.Scanner;

public class P11729 {
  static int count = 0;
  static StringBuilder stringBuilder = new StringBuilder();

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int floor = scanner.nextInt();

    top(floor, 1, 3);
    System.out.println(count);
    System.out.println(stringBuilder);
  }

  static void top(int floor, int start, int target) {
    if (floor > 1) top(floor - 1, start, 6 - start - target);

    stringBuilder.append(start + " " + target + "\n");
    count++;

    if (floor > 1) top(floor - 1, 6 - start - target, target);
  }
}
