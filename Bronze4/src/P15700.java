import java.util.Scanner;

public class P15700 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      long row = scanner.nextLong();
      long col = scanner.nextLong();

      System.out.println((row * col) / 2);
    }
  }
}
