import java.util.Scanner;

public class P5524 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < testCase; i++) {
      String name = scanner.nextLine();

      System.out.println(name.toLowerCase());
    }
  }
}
