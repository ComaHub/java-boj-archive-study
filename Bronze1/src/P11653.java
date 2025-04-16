import java.util.Scanner;

public class P11653 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    int pointer = 2;

    while (num > 1) {
      if (num % pointer == 0) {
        System.out.println(pointer);
        num /= pointer;
      } else {
        pointer++;
      }
    }
  }
}
