package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P24805 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int upCount = scanner.nextInt();
      int downCount = scanner.nextInt();
      int goalLength = scanner.nextInt();

      int day = 0;
      int move = 0;
      while (true) {
        if (day == 0) {
          move += upCount;
        } else {
          move += (upCount - downCount);
        }

        day++;

        if (move >= goalLength) {
          System.out.println(day);
          break;
        }
      }
    }
  }
}
