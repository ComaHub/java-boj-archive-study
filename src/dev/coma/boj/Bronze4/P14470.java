package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P14470 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int startTemp = scanner.nextInt();
      int endTemp = scanner.nextInt();

      int minusTime = scanner.nextInt();
      int zeroTime = scanner.nextInt();
      int plusTime = scanner.nextInt();

      if (startTemp < 0) {
        System.out.println((-startTemp * minusTime) + zeroTime + (endTemp * plusTime));
      } else {
        System.out.println((endTemp - startTemp) * plusTime);
      }
    }
  }
}
