package dev.coma.boj.Silver5;

import java.util.Scanner;

public class P1531 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int paperCount = scanner.nextInt();
      int minCount = scanner.nextInt();
      int[][] frags = new int[100][100];

      for (int i = 0; i < paperCount; i++) {
        int[] startPoint = {scanner.nextInt() - 1, scanner.nextInt() - 1};
        int[] endPoint = {scanner.nextInt() - 1, scanner.nextInt() - 1};

        cover(frags, startPoint, endPoint);
      }

      System.out.println(countBlind(frags, minCount));
    }
  }

  private static void cover(int[][] frags, int[] startPoint, int[] endPoint) {
    for (int i = startPoint[0]; i <= endPoint[0]; i++) {
      for (int j = startPoint[1]; j <= endPoint[1]; j++) {
        frags[i][j]++;
      }
    }
  }

  private static int countBlind(int[][] frags, int minCount) {
    int result = 0;

    for (int[] row : frags) {
      for (int point : row) {
        if (point > minCount) result++;
      }
    }

    return result;
  }
}
