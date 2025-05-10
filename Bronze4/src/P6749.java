import java.util.Scanner;

public class P6749 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int lastChildAge = scanner.nextInt();
    int midChildAge = scanner.nextInt();

    System.out.println(midChildAge + (midChildAge - lastChildAge));
  }
}
