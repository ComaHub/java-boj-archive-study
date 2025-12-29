package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P24603 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int ingredientCount = scanner.nextInt();
      int foodCount = scanner.nextInt();
      int goalCount = scanner.nextInt();

      for (int i = 0; i < ingredientCount; i++) {
        System.out.println((int) (scanner.nextDouble() / foodCount * goalCount));
      }
    }
  }
}
