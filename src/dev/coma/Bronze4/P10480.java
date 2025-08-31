package dev.coma.Bronze4;

import java.util.Scanner;

public class P10480 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = scanner.nextInt();

      for (int i = 0; i < testCase; i++) {
        int number = scanner.nextInt();

        System.out.println(number + (number % 2 == 0 ? " is even" : " is odd"));
      }
    }
  }
}
