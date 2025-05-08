import java.util.Scanner;

public class P6764 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int pointer = 0;
    boolean isMove = false;
    int[] numbers = new int[4];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }

    for (int i = 0; i < numbers.length - 1; i++) {
      if (numbers[i + 1] - numbers[i] > 0) {
        pointer++;
        isMove = true;
      } else if (numbers[i + 1] - numbers[i] < 0) {
        pointer--;
        isMove = true;
      }
    }

    if (pointer == 3) {
      System.out.println("Fish Rising");
    } else if (pointer == -3) {
      System.out.println("Fish Diving");
    } else if (pointer == 0 && !isMove) {
      System.out.println("Fish At Constant Depth");
    } else {
      System.out.println("No Fish");
    }
  }
}
