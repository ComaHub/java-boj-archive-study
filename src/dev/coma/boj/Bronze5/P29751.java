package dev.coma.boj.Bronze5;

import java.util.Scanner;


public class P29751 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      double width = scanner.nextDouble();
      double height = scanner.nextDouble();

      double result = (width * height) / 2;
      System.out.printf("%.1f", result);
    }
  }
}
