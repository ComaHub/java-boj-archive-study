package dev.coma.Silver3;

import java.util.Scanner;

public class P1003 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			int[][] resultArr = new int[41][2];
			resultArr[0][0] = 1;
			resultArr[0][1] = 0;
			resultArr[1][0] = 0;
			resultArr[1][1] = 1;
			for (int i = 2; i < resultArr.length; i++) {
			  resultArr[i][0] = resultArr[i - 1][0] + resultArr[i - 2][0];
			  resultArr[i][1] = resultArr[i - 1][1] + resultArr[i - 2][1];
			}

			for (int i = 0; i < testCase; i++) {
			  int num = scanner.nextInt();
			  System.out.println(resultArr[num][0] + " " + resultArr[num][1]);
			}
		}
  }
}
