package dev.coma.boj.Gold5;

import java.util.Scanner;

public class P1074 {
  public static void main(String[] args) {
    int num, row, col;
    try (Scanner scanner = new Scanner(System.in)) {
      num = scanner.nextInt();
      row = scanner.nextInt();
      col = scanner.nextInt();
    }

    System.out.println(process(0, 0, (int) Math.pow(2, num), row, col) - 1);
  }

  private static int process(int startX, int startY, int length, int row, int col) {
    if (!(row >= startX && row < startX + length) || !(col >= startY && col < startY + length)) {
      if (row >= startX + length) return length * length;
      else if ((row >= startX && row < startX + length) && col >= startY + length) return length * length;
      else return 0;
    }

    if (length == 1) return 1;
    else {
      int sum = 0;
      length /= 2;
      sum += process(startX, startY, length, row, col);
      sum += process(startX + length, startY, length, row, col);
      sum += process(startX, startY + length, length, row, col);
      sum += process(startX + length, startY + length, length, row, col);

      return sum;
    }
  }
}
