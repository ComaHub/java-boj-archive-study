import java.util.Scanner;

public class P15727 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int result = n / 5;
    if ((n % 5) != 0) {
      result++;
    }

    System.out.println(result);
  }
}
