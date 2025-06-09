import java.util.Scanner;

public class P2903 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    System.out.println((int) Math.pow(Math.pow(2, num) + 1, 2));
  }
}
