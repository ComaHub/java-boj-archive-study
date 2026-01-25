package dev.coma.boj.Gold4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1253 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numCount = Integer.parseInt(scanner.nextLine());

      Integer[] numArr = Arrays.stream(scanner.nextLine().split(" "))
              .map(Integer::valueOf)
              .sorted(Comparator.naturalOrder())
              .toArray(Integer[]::new)
              ;

      int counter = 0;
      for (int i = 0; i < numArr.length; i++) {
        if (isGood(numArr, i)) counter++;
      }

      System.out.println(counter);
    }
  }

  private static boolean isGood(Integer[] numArr, int idx) {
    int startIdx = 0;
    int endIdx = numArr.length - 1;

    while (startIdx < endIdx) {
      int sum = numArr[startIdx] + numArr[endIdx];

      if (sum > numArr[idx]) endIdx--;
      else if (sum < numArr[idx]) startIdx++;
      else {
        if (startIdx != idx && endIdx != idx) return true;
        else if (startIdx == idx) startIdx++;
        else endIdx--;
      }
    }

    return false;
  }
}

// 이 문제는 Do It! 알고리즘 코딩테스트 교재의 투 포인터 실습 문제로 활용되었습니다.