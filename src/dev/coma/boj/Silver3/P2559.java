package dev.coma.boj.Silver3;

import java.util.Scanner;

public class P2559 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int tempCase = scanner.nextInt();
      int period = scanner.nextInt();

      int[] tempArr = new int[tempCase];
      for (int i = 0; i < tempArr.length; i++) {
        tempArr[i] = scanner.nextInt();
      }

      int[] tempSumArr = calcSumArr(tempArr);

      System.out.println(calcMaxSum(tempSumArr, period));
    }
  }

  private static int[] calcSumArr(int[] arr) {
    int[] result = new int[arr.length];
    result[0] = arr[0];
    for (int i = 1; i < result.length; i++) {
      result[i] = result[i - 1] + arr[i];
    }

    return result;
  }

  private static int calcMaxSum(int[] sumArr, int period) {
    int max = sumArr[period - 1];

    for (int i = 1; i < sumArr.length - period + 1; i++) {
      int sum = sumArr[i + period - 1] - sumArr[i - 1];

      if (sum > max) max = sum;
    }

    return max;
  }
}
