import java.util.Scanner;

public class P5522 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    for (int i = 0; i < 5; i++) {
      sum += scanner.nextInt();
    }

    System.out.println(sum);
  }
}
