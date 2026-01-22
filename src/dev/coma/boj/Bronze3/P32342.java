package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P32342 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = scanner.nextInt();
      String wow = "WOW";
      scanner.nextLine();

      for (int i = 0; i < testCase; i++) {
        int count = 0;
        String input = scanner.nextLine();

        for (int j = 0; j < input.length() - 2; j++) {
          if (wow.equals(input.substring(j, j + 3))) count++;
        }

        System.out.println(count);
      }
    }
  }
}
