import java.util.Scanner;

public class P10872 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int result = 1;
    for (int i = n; i > 1; i--) {
      result *= i;
    }

    System.out.println(result);
  }
}
