package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P30917 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numA = 0, numB = 0;

      for (int i = 1; i <= 9; i++) {
        System.out.println("? A " + i);
        int result = scanner.nextInt();

        if (result == 1) {
          numA = i;
          break;
        }
      }

      for (int i = 1; i <= 9; i++) {
        System.out.println("? B " + i);
        int result = scanner.nextInt();

        if (result == 1) {
          numB = i;
          break;
        }
      }

      System.out.println("! " + (numA + numB));
    }
  }
}
