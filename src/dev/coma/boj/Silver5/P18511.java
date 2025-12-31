package dev.coma.boj.Silver5;

import java.util.Scanner;

public class P18511 {
  private static int result = 0;

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String[] input = scanner.nextLine().split(" ");
      int numN = Integer.parseInt(input[0]);
      int numK = Integer.parseInt(input[1]);

      String[] numbers = scanner.nextLine().split(" ");
      String madeNum = "";

      makeNumber(numbers, madeNum, numN, numK);
      System.out.println(result);
    }
  }

  private static void makeNumber(String[] numbers, String madeNum, int numN, int numK) {
    if (!madeNum.isEmpty()) {
      int madeNumInt = Integer.parseInt(madeNum);

      if (madeNumInt > numN) return;
      if (madeNumInt > result) result = madeNumInt;
    }

    for (String number : numbers) {
      String newMadeNum = madeNum + number;
      makeNumber(numbers, newMadeNum, numN, numK);
    }
  }
}
