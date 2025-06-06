import java.util.Scanner;

public class P10406 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int waistLength = scanner.nextInt();
    int neckLength = scanner.nextInt();
    int punchCount = scanner.nextInt();

    int count = 0;
    for (int i = 0; i < punchCount; i++) {
      int punch = scanner.nextInt();
      if (punch >= waistLength && punch <= neckLength) count++;
    }

    System.out.println(count);
  }
}
