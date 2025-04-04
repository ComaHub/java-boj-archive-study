import java.util.Scanner;

public class P15964 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long a = scanner.nextLong();
    long b = scanner.nextLong();

    System.out.println(calculateAt(a, b));
  }

  public static long calculateAt(long a, long b) {
    return (a + b) * (a - b);
  }
}
