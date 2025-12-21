package dev.coma.boj.Bronze1;

import java.util.Scanner;

public class P11179 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String input = Integer.toBinaryString(scanner.nextInt());
      String result = new StringBuilder(input).reverse().toString();
      System.out.println(Integer.valueOf(result, 2));
    }
  }
}
