package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P26532 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int land = scanner.nextInt() * scanner.nextInt();
      int result = land / (5 * 4840);
      System.out.println(land % (5 * 4840) == 0 ? result : result + 1);
    }
  }
}
