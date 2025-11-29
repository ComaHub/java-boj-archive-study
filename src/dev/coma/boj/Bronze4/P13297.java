package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P13297 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = scanner.nextInt();
      scanner.nextLine();

      for (int i = 0; i < testCase; i++) {
        String input = scanner.nextLine();
        System.out.println(input.length());
      }
    }
  }
}
