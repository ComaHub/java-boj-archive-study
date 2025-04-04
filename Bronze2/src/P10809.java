import java.util.Arrays;
import java.util.Scanner;

public class P10809 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] result = new int[26];
    Arrays.fill(result, -1);

    String[] word = scanner.nextLine().split("");
    int count = 0;

    for (String s : word) {
      char c = s.charAt(0);
      if (result[c - 97] == -1) {
        result[c - 97] = count;
      }
      count++;
    }

    for (int i : result) {
      System.out.print(i + " ");
    }
  }
}
