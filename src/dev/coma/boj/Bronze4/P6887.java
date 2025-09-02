package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P6887 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int tiles = scanner.nextInt();
      int length = 0;

      while (true) {
        length++;

        if ((length * length) > tiles) {
          length--;
          break;
        }
      }

      System.out.println("The largest square has side length " + length + ".");
    }
  }
}
