import java.util.Scanner;

public class P32246 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numN = scanner.nextInt();

      if (numN == 2) System.out.println("3");
      else System.out.println(numN);
    }
  }
}
