package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P32297 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int length = Integer.parseInt(scanner.nextLine());
      String input = scanner.nextLine();

      System.out.println(input.contains("gori") ? "YES" : "NO");
    }
  }
}
