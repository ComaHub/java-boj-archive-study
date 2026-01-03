package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P21591 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int notebookWidth = scanner.nextInt();
      int notebookHeight = scanner.nextInt();

      int stickerWidth = scanner.nextInt();
      int stickerHeight = scanner.nextInt();

      System.out.println((notebookWidth >= stickerWidth + 2 && notebookHeight >= stickerHeight + 2) ? 1 : 0);
    }
  }
}
