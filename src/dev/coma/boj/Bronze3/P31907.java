package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P31907 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numK = scanner.nextInt();
      String[] words = {"G", ".", ".", ".", ".", "I", ".", "T", ".", ".", "S", "."};

      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < words.length; i++) {
        stringBuilder.append(words[i].repeat(numK));

        if (i % 4 == 3) {
          for (int j = 0; j < numK; j++) {
            System.out.println(stringBuilder);
          }

          stringBuilder = new StringBuilder();
        }
      }
    }
  }
}
