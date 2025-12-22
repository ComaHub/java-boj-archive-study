package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P23375 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int pointX = scanner.nextInt();
      int pointY = scanner.nextInt();
      int length = scanner.nextInt();

      System.out.println((pointX - length) + " " + (pointY + length));
      System.out.println((pointX + length) + " " + (pointY + length));
      System.out.println((pointX + length) + " " + (pointY - length));
      System.out.println((pointX - length) + " " + (pointY - length));
    }
  }
}
