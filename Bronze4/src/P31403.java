import java.util.Scanner;

public class P31403 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    int numResult = a + b - c;
    int stringResult = Integer.parseInt(String.valueOf(a) + (b)) - c;

    System.out.println(numResult);
    System.out.println(stringResult);
  }
}
