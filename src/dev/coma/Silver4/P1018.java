package dev.coma.Silver4;

import java.util.Scanner;

public class P1018 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			char[][] chessBoard = new char[scanner.nextInt()][scanner.nextInt()];
			scanner.nextLine();
			for (int i = 0; i < chessBoard.length; i++) {
			  String line = scanner.nextLine();

			  for (int j = 0; j < chessBoard[i].length; j++) {
			    chessBoard[i][j] = line.charAt(j);
			  }
			}

			int minimumChange = Integer.MAX_VALUE;
			for (int i = 0; i < chessBoard.length - 7; i++) {
			  for (int j = 0; j < chessBoard[i].length - 7; j++) {
			    char[][] newBoard = set8x8Board(chessBoard, i, j);

			    int resultWB = compareWB(newBoard);
			    int resultBW = compareBW(newBoard);

			    if (resultWB < minimumChange) minimumChange = resultWB;
			    if (resultBW < minimumChange) minimumChange = resultBW;
			  }
			}

			System.out.println(minimumChange);
		}
  }

  static char[][] set8x8Board(char[][] chessBoard, int rowNum, int colNum) {
    char[][] newBoard = new char[8][8];

    for (int i = rowNum; i < rowNum + 8; i++) {
      for (int j = colNum; j < colNum + 8; j++) {
        newBoard[i - rowNum][j - colNum] = chessBoard[i][j];
      }
    }

    return newBoard;
  }

  static int compareWB(char[][] chessBoard) {
    int changeCount = 0;

    for (int i = 0; i < 8; i += 2) {
      for (int j = 0; j < 8; j += 2) {
        if (chessBoard[i][j] != 'W') changeCount++;
      }

      for (int j = 1; j < 8; j += 2) {
        if (chessBoard[i][j] != 'B') changeCount++;
      }
    }

    for (int i = 1; i < 8; i += 2) {
      for (int j = 0; j < 8; j += 2) {
        if (chessBoard[i][j] != 'B') changeCount++;
      }

      for (int j = 1; j < 8; j += 2) {
        if (chessBoard[i][j] != 'W') changeCount++;
      }
    }

    return changeCount;
  }

  static int compareBW(char[][] chessBoard) {
    int changeCount = 0;

    for (int i = 0; i < 8; i += 2) {
      for (int j = 0; j < 8; j += 2) {
        if (chessBoard[i][j] != 'B') changeCount++;
      }

      for (int j = 1; j < 8; j += 2) {
        if (chessBoard[i][j] != 'W') changeCount++;
      }
    }

    for (int i = 1; i < 8; i += 2) {
      for (int j = 0; j < 8; j += 2) {
        if (chessBoard[i][j] != 'W') changeCount++;
      }

      for (int j = 1; j < 8; j += 2) {
        if (chessBoard[i][j] != 'B') changeCount++;
      }
    }

    return changeCount;
  }
}
