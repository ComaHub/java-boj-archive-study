import java.util.Scanner;

public class P30017 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int patty = scanner.nextInt();
    int cheese = scanner.nextInt();

    if (patty > (cheese + 1)) {
      patty = cheese + 1;
    }

    if (cheese > (patty - 1)) {
      cheese = patty - 1;
    }

    System.out.println(patty + cheese);
  }
}
