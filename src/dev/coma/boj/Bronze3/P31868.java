package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P31868 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int level = scanner.nextInt();
      int cherry = scanner.nextInt();

      int need = (int) Math.pow(2, (level - 1));
      System.out.println(cherry / need);
    }
  }
}
