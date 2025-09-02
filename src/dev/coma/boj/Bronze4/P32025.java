package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P32025 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int height = scanner.nextInt();
      int width = scanner.nextInt();

      int length = Math.min(height, width);
      System.out.println(length * 50);
    }
  }
}