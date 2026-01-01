package dev.coma.boj.Bronze1;

import java.util.Scanner;

public class P23882 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int arrLength = scanner.nextInt();
      int numK = scanner.nextInt();

      int[] numArr = new int[arrLength];
      for (int i = 0; i < arrLength; i++) {
        numArr[i] = scanner.nextInt();
      }

      int pointer = arrLength - 1;
      int count = 0;
      while (pointer > 0) {
        int maxNum = numArr[0];
        int maxIndex = 0;

        for (int i = 1; i < pointer; i++) {
          if (numArr[i] > maxNum) {
            maxNum = numArr[i];
            maxIndex = i;
          }
        }

        if (maxNum > numArr[pointer]) {
          numArr[maxIndex] = numArr[pointer];
          numArr[pointer] = maxNum;
          count++;
        }

        if (count == numK) {
          for (int num : numArr) {
            System.out.print(num + " ");
          }

          return;
        }

        pointer--;
      }

      System.out.println(-1);
    }
  }
}
