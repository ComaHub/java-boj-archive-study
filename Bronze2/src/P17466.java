import java.util.Scanner;

public class P17466 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int inputN = scanner.nextInt();
    int inputP = scanner.nextInt();

    long result = 1;
    for (int i = 2; i <= inputN; i++) {
      result *= i;
      result %= inputP;
    }

    System.out.println(result);
  }
}
