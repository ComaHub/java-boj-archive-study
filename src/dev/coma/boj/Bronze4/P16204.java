package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P16204 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int cardNum = scanner.nextInt();
      int frontO = scanner.nextInt();
      int backO = scanner.nextInt();

      int frontX = cardNum - frontO;
      int backX = cardNum - backO;

      int doubleO = Math.min(frontO, backO);
      int doubleX = Math.min(frontX, backX);

      System.out.println(doubleO + doubleX);
    }
  }
}
