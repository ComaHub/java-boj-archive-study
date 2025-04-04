import java.util.Scanner;

public class P2475 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int result = 0;
    for (int i = 0; i < 5; i++) {
      int num = scanner.nextInt();
      result += (num * num);
    }

    System.out.println(result % 10);
  }
}
