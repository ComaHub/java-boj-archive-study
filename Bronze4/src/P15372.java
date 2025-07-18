import java.util.Scanner;

public class P15372 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    for (int i = 0; i < testCase; i++) {
      long num = scanner.nextLong();

      System.out.println(num * num);
    }
  }
}
