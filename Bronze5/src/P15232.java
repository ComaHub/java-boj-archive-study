import java.util.Scanner;

public class P15232 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int numR = scanner.nextInt();
    int numC = scanner.nextInt();
    for (int i = 0; i < numR; i++) {
      System.out.println("*".repeat(numC));
    }
  }
}
