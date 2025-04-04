import java.util.Scanner;

public class P4153 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      int[] triangle = new int[3];
      int max = 0;
      for (int i = 0; i < 3; i++) {
        triangle[i] = scanner.nextInt();

        if (triangle[i] > max) {
          max = triangle[i];
        }
      }

      if (triangle[0] == 0) {
        return;
      }

      int left = 0;
      int right = 0;
      for (int i : triangle) {
        if (i == max) {
          right += i * i;
        } else {
          left += i * i;
        }
      }

      if (left == right) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
  }
}
