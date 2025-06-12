import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class P9012 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Deque<String> stack = new ArrayDeque<>();

    int testCase = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < testCase; i++) {
      stack.clear();
      String[] ps = scanner.nextLine().split("");

      try {
        for (String p : ps) {
          switch (p) {
            case "(" -> stack.push("PS");
            case ")" -> stack.pop();
          }
        }

        if (stack.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
      } catch (NoSuchElementException e) {
        System.out.println("NO");
      }
    }
  }
}
