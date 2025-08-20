import java.util.Scanner;

public class P8674 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      long row = scanner.nextLong();
      long col = scanner.nextLong();

      long max = Math.max(row, col);
      long min = Math.min(row, col);

      if (max % 2 == 0) System.out.println(0);
      else if (min % 2 == 0) System.out.println(0);
      else System.out.println(min);
    }
  }
}
