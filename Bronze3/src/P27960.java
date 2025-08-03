import java.util.Scanner;

public class P27960 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int sumA = scanner.nextInt();
    int sumB = scanner.nextInt();

    int point = 512;
    int result = 0;
    for (int i = 0; i < 10; i++) {
      if (sumA >= point && sumB >= point) {
        sumA -= point;
        sumB -= point;
      } else if (sumA >= point) {
        sumA -= point;
        result += point;
      } else if (sumB >= point) {
        sumB -= point;
        result += point;
      }

      point /= 2;
    }

    System.out.println(result);
  }
}
