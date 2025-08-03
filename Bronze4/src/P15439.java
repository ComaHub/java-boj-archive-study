import java.util.Scanner;

public class P15439 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    System.out.println((num * num) - num);
  }
}
