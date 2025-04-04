import java.util.Scanner;

public class P10833 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();

    int remainApple = 0;
    for (int i = 0; i < testCase; i++) {
      int people = scanner.nextInt();
      int apples = scanner.nextInt();

      remainApple += apples % people;
    }

    System.out.println(remainApple);
  }
}
