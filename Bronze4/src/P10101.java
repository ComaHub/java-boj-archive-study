import java.util.Scanner;

public class P10101 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int rad1 = scanner.nextInt();
    int rad2 = scanner.nextInt();
    int rad3 = scanner.nextInt();

    if (rad1 + rad2 + rad3 != 180) {
      System.out.println("Error");
    } else if (rad1 == rad2 && rad2 == rad3) {
      System.out.println("Equilateral");
    } else if (rad1 == rad2 || rad1 == rad3 || rad2 == rad3) {
      System.out.println("Isosceles");
    } else {
      System.out.println("Scalene");
    }
  }
}
