package dev.coma.boj.Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2630 {
  private static int white = 0;
  private static int blue = 0;

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int length = Integer.parseInt(br.readLine());

      String[][] board = new String[length][length];
      for (int i = 0; i < board.length; i++) {
        board[i] = br.readLine().split(" ");
      }

      slice(board, 0, 0, length);
      System.out.println(white);
      System.out.println(blue);
    } catch (Exception e) {
      System.err.println(e.getStackTrace()[0]);
    }
  }

  private static void slice(String[][] board, int pointX, int pointY, int length) {
    if (length < 1) return;

    boolean isWhite = false;
    boolean isBlue = false;

    for (int i = pointX; i < (pointX + length); i++) {
      for (int j = pointY; j < (pointY + length); j++) {
        if ("1".equals(board[i][j])) isBlue = true;
        else isWhite = true;
      }
    }

    if (!isWhite) blue++;
    else if (!isBlue) white++;
    else {
      int newLength = length / 2;

      slice(board, pointX, pointY, newLength);
      slice(board, pointX + newLength, pointY, newLength);
      slice(board, pointX, pointY + newLength, newLength);
      slice(board, pointX + newLength, pointY + newLength, newLength);
    }
  }
}
