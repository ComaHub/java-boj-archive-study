package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P14924 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numS = scanner.nextInt();
      int numT = scanner.nextInt();
      int numD = scanner.nextInt();

      System.out.println((numD / (numS * 2)) * numT);
    }
  }
}
