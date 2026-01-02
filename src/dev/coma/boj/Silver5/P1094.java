package dev.coma.boj.Silver5;

import java.util.Scanner;

public class P1094 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int needLength = scanner.nextInt();

      int originStick = 64;
      int newStick = 0;
      int stickCount = 1;
      while (originStick + newStick != needLength) {
        if (originStick + newStick > needLength) {
          originStick /= 2;

          if (originStick + newStick < needLength) {
            newStick += originStick;
            stickCount++;
          }
        }
      }

      System.out.println(stickCount);
    }
  }
}
