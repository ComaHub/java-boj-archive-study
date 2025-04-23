import java.util.Scanner;

public class P26307 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int hour = scanner.nextInt();
    int minute = scanner.nextInt();

    int result = ((hour - 9) * 60) + minute;
    System.out.println(result);
  }
}
