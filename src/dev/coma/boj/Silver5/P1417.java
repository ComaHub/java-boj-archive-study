package dev.coma.boj.Silver5;

import java.util.Scanner;

public class P1417 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int candidateCount = scanner.nextInt();
      int[] candidates = new int[candidateCount];

      for (int i = 0; i < candidateCount; i++) {
        candidates[i] = scanner.nextInt();
      }

      if (candidateCount == 1) {
        System.out.println(0);
        return;
      }

      int lobbyCount = 0;
      while (true) {
        int dasomPoint = candidates[0];

        int maxIndex = 0;
        int maxPoint = 0;
        for (int i = 1; i < candidateCount; i++) {
          if (candidates[i] > maxPoint) {
            maxPoint = candidates[i];
            maxIndex = i;
          }
        }

        if (dasomPoint > maxPoint) break;

        candidates[maxIndex] = --maxPoint;
        candidates[0] = ++dasomPoint;
        lobbyCount++;
      }

      System.out.println(lobbyCount);
    }
  }
}
