package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P17598 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int tigerCount = 0;
      int lionCount = 0;

      for (int i = 0; i < 9; i++) {
        String input = scanner.nextLine();

        if ("Tiger".equals(input)) tigerCount++;
        else lionCount++;
      }

      System.out.println(tigerCount > lionCount ? "Tiger" : "Lion");
    }
  }
}
