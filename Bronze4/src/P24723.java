import java.util.Scanner;

public class P24723 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    int result = 1;
    for (int i = 0; i < num; i++) {
      result *= 2;
    }

    System.out.println(result);
  }
}
