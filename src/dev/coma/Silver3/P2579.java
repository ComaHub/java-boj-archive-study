package dev.coma.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 미해결

public class P2579 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int stair = Integer.parseInt(bufferedReader.readLine());
    int[] stairsArr = new int[stair];
    for (int i = 0; i < stairsArr.length; i++) {
      stairsArr[i] = Integer.parseInt(bufferedReader.readLine());
    }

    if (stair == 1) {
      System.out.println(stairsArr[0]);
      return;
    }

    int[] sumArr = new int[stairsArr.length];
    boolean[] sumArrLimit = new boolean[stairsArr.length];

    sumArr[0] = stairsArr[0];
    sumArrLimit[0] = false;
    sumArr[1] = sumArr[0] + stairsArr[1];
    sumArrLimit[1] = true;

    for (int i = 2; i < stairsArr.length; i++) {
      int oneStep = sumArr[i - 1] + stairsArr[i];
      int twoStep = sumArr[i - 2] + stairsArr[i];

      if (sumArrLimit[i - 1]) {
        sumArr[i] = twoStep;
        sumArrLimit[i] = false;
      } else {
        if (twoStep >= oneStep) {
          sumArr[i] = twoStep;
          sumArrLimit[i] = false;
        } else {
          sumArr[i] = oneStep;
          sumArrLimit[i] = true;
        }
      }
    }

    System.out.println(sumArr[sumArr.length - 1]);
    bufferedReader.close();
  }
}
