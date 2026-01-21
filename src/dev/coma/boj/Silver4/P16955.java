package dev.coma.boj.Silver4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class P16955 {
  private static final String[][] GO_BOARD = new String[10][10];
  private static final Scanner SCANNER = new Scanner(System.in);
  private static final List<String> CHECK_LIST = new ArrayList<>();

  public static void main(String[] args) {
    fillBoard();
    checkBoard();

    SCANNER.close();
  }

  private static void fillBoard() {
    for (int i = 0; i < 10; i++) {
      String[] inputLine = SCANNER.nextLine().split("");

      for (int j = 0; j < inputLine.length; j++) {
        switch (inputLine[j]) {
          case "O" -> GO_BOARD[i][j] = "O";
          case "X" -> GO_BOARD[i][j] = "X";
        }
      }
    }
  }

  private static void checkBoard() {
    for (int i = 0; i < GO_BOARD.length; i++) {
      for (int j = 0; j < GO_BOARD[i].length; j++) {
        if (checkWin(i, j)) {
          System.out.println(1);
          return;
        }
      }
    }

    System.out.println(0);
  }

  private static boolean checkWin(int row, int col) {
    return goRight(row, col) || goRightSlide(row, col) || goDown(row, col) || goLeftSlide(row, col);
  }

  private static boolean goRight(int row, int col) {
    if (col > 5) return false;

    CHECK_LIST.clear();

    while (CHECK_LIST.size() != 5) {
      CHECK_LIST.add(GO_BOARD[row][col++]);
    }

    return checkList();
  }

  private static boolean goDown(int row, int col) {
    if (row > 5) return false;

    CHECK_LIST.clear();

    while (CHECK_LIST.size() != 5) {
      CHECK_LIST.add(GO_BOARD[row++][col]);
    }

    return checkList();
  }

  private static boolean goRightSlide(int row, int col) {
    if (row > 5 || col > 5) return false;

    CHECK_LIST.clear();

    while (CHECK_LIST.size() != 5) {
      CHECK_LIST.add(GO_BOARD[row++][col++]);
    }

    return checkList();
  }

  private static boolean goLeftSlide(int row, int col) {
    if (row > 5 || col < 4) return false;

    CHECK_LIST.clear();

    while (CHECK_LIST.size() != 5) {
      CHECK_LIST.add(GO_BOARD[row++][col--]);
    }

    return checkList();
  }

  private static boolean checkList() {
    int countX = 0;
    int countNull = 0;

    for (String str : CHECK_LIST) {
      if ("X".equals(str)) countX++;
      if (Objects.isNull(str)) countNull++;
    }

    return countX == 4 && countNull == 1;
  }
}
