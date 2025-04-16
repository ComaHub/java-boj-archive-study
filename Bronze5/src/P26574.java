import java.util.Scanner;

public class P26574 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    for (int i = 0; i < testCase; i++) {
      int num = scanner.nextInt();
      System.out.println(num + " " + num);
    }
  }
}
