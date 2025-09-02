package dev.coma.boj.Silver1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P11660 {
  private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) {
    try (BR; BW) {
      String[] settings = BR.readLine().split(" ");
      int size = Integer.parseInt(settings[0]);
      int testCase = Integer.parseInt(settings[1]);

      int[][] table = new int[size][size];
      for (int i = 0; i < table.length; i++) {
        String[] rowNums = BR.readLine().split(" ");
        for (int j = 0; j < table[i].length; j++) {
          table[i][j] = Integer.parseInt(rowNums[j]);
        }
      }

      int[][] sumTable = calcSumTable(table);

      for (int i = 0; i < testCase; i++) {
        BW.write(calcSum(sumTable, BR.readLine()) + "\n");
      }

      BW.flush();
    } catch (Exception e) { e.printStackTrace(); }
  }

  private static int[][] calcSumTable(int[][] table) {
    int[][] result = new int[table.length][table.length];

    result[0][0] = table[0][0];
    for (int i = 1; i < table[0].length; i++) {
      result[0][i] = result[0][i - 1] + table[0][i];
    }

    for (int i = 1; i < table.length; i++) {
      result[i][0] = result[i - 1][0] + table[i][0];

      for (int j = 1; j < table[i].length; j++) {
        result[i][j] = result[i - 1][j] + result[i][j - 1] - result[i - 1][j - 1] + table[i][j];
      }
    }

    return result;
  }

  private static int calcSum(int[][] sumTable, String input) {
    String[] inputArr = input.split(" ");
    int startX = Integer.parseInt(inputArr[0]) - 1;
    int startY = Integer.parseInt(inputArr[1]) - 1;
    int endX = Integer.parseInt(inputArr[2]) - 1;
    int endY = Integer.parseInt(inputArr[3]) - 1;

    if (startX == 0 && startY == 0) {
      return sumTable[endX][endY];
    } else if (startX == 0) {
      return sumTable[endX][endY] - sumTable[endX][startY - 1];
    } else if (startY == 0) {
      return sumTable[endX][endY] - sumTable[startX - 1][endY];
    } else {
      return sumTable[endX][endY] - sumTable[endX][startY - 1] - sumTable[startX - 1][endY] + sumTable[startX - 1][startY - 1];
    }
  }
}
