package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P23627 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String input = scanner.nextLine();

      System.out.println(input.endsWith("driip") ? "cute" : "not cute");
    }
  }
}
