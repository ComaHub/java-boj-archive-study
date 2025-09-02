package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P14645 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int stops = scanner.nextInt();
      @SuppressWarnings("unused")
      int people = scanner.nextInt();

      for (int i = 0; i < stops; i++) {
        people += scanner.nextInt();
        people -= scanner.nextInt();
      }
    }

    System.out.println("비와이");
  }
}
