package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P5613 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int result = Integer.parseInt(scanner.nextLine());

      while (true) {
        String input = scanner.nextLine();
        if ("=".equals(input)) {
          System.out.println(result);
          break;
        }

        int num = Integer.parseInt(scanner.nextLine());
        switch (input) {
          case "+" -> result += num;
          case "-" -> result -= num;
          case "*" -> result *= num;
          case "/" -> result /= num;
        }
      }
    }
  }
}
