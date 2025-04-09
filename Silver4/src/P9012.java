import java.util.Scanner;

public class P9012 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < testCase; i++) {
      int pointer = 0;
      boolean isVPS = true;
      String[] vps = scanner.nextLine().split("");

      for (String s : vps) {
        if (s.equals("(")) {
          pointer++;
        } else {
          pointer--;
        }

        if (pointer < 0) {
          isVPS = false;
        }
      }

      if (pointer > 0) {
        isVPS = false;
      }

      if (isVPS) System.out.println("YES");
      else System.out.println("NO");
    }
  }
}
