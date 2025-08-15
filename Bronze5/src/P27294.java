import java.util.Scanner;

public class P27294 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int time = scanner.nextInt();
      int withSake = scanner.nextInt();

      if (time >= 12 && time <= 16 && withSake == 0) {
        System.out.println("320");
      } else {
        System.out.println("280");
      }
    }
  }
}