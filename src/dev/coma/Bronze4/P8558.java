package dev.coma.Bronze4;

import java.util.Scanner;

public class P8558 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int number = scanner.nextInt();

      int result = 1;
      for (int i = 1; i <= number; i++) {
        result *= i;
        result %= 10;
      }

      System.out.println(result);
    }
  }
}
