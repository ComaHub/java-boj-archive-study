import java.util.Scanner;

public class P1463 {
  static int minCount = Integer.MAX_VALUE;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    int count = 0;

    if (num == 1) System.out.println(0);
    else {
      program(num, count);
      System.out.println(minCount);
    }
  }

  static void program(int num, int count) {
    if (num < 1 || count >= minCount) return;

    if (num % 3 == 0) {
      int newNum = num / 3;
      count++;

      if (newNum == 1) {
        minCount = Math.min(count, minCount);
        return;
      } else {
        program(newNum, count);
        count--;
      }
    }

    if (num % 2 == 0) {
      int newNum = num / 2;
      count++;

      if (newNum == 1) {
        minCount = Math.min(count, minCount);
        return;
      } else {
        program(newNum, count);
        count--;
      }
    }

    num--;
    count++;
    if (num == 1) {
      minCount = Math.min(count, minCount);
    } else {
      program(num, count);
    }
  }
}
