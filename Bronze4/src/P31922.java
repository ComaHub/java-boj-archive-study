import java.util.Scanner;

public class P31922 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int div1 = scanner.nextInt();
    int div2 = scanner.nextInt();
    int shake = scanner.nextInt();

    if ((div1 + shake) > div2) {
      System.out.println(div1 + shake);
    } else {
      System.out.println(div2);
    }
  }
}
