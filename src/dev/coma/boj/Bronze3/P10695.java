package dev.coma.boj.Bronze3;

import java.util.Scanner;

@SuppressWarnings("unused")
public class P10695 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = scanner.nextInt();
      for (int i = 1; i <= testCase; i++) {
        int size = scanner.nextInt();
        int posR1 = scanner.nextInt();
        int posC1 = scanner.nextInt();
        int posR2 = scanner.nextInt();
        int posC2 = scanner.nextInt();

        boolean result = false;
        if (Math.abs(posR1 - posR2) == 2 && Math.abs(posC1 - posC2) == 1) result = true;
        else if (Math.abs(posR1 - posR2) == 1 && Math.abs(posC1 - posC2) == 2) result = true;

        System.out.println("Case " + i + ": " + (result ? "YES" : "NO"));
      }
    }
  }
}
