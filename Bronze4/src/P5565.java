import java.util.Scanner;

public class P5565 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int fullPrice = scanner.nextInt();
    for (int i = 0; i < 9; i++) {
      fullPrice -= scanner.nextInt();
    }

    System.out.println(fullPrice);
  }
}
