package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P18411 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numA = scanner.nextInt();
      int numB = scanner.nextInt();
      int numC = scanner.nextInt();

      System.out.println((numA + numB + numC) - (Math.min(Math.min(numA, numB), numC)));
    }
  }
}
