import java.util.Scanner;

public class P5585 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int cash = 1000 - scanner.nextInt();
    int[] money = {500, 100, 50, 10, 5, 1};

    int count = 0;
    int pointer = 0;
    while (cash > 0) {
      if (cash - money[pointer] >= 0) {
        cash -= money[pointer];
        count++;
      } else {
        pointer++;
      }
    }

    System.out.println(count);
  }
}
