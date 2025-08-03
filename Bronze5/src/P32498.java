import java.util.Scanner;

public class P32498 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    int count = 0;
    for (int i = 0; i < testCase; i++) {
      int number = scanner.nextInt();
      if (number % 2 != 0) count++;
    }

    System.out.println(count);
  }
}
