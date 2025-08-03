import java.util.Scanner;

public class P2908 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int a = Integer.parseInt(new StringBuffer(String.valueOf(scanner.nextInt())).reverse().toString());
    int b = Integer.parseInt(new StringBuffer(String.valueOf(scanner.nextInt())).reverse().toString());

    if (a > b) {
      System.out.println(a);
    } else {
      System.out.println(b);
    }
  }
}
