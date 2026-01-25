package dev.coma.boj.Silver4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1940 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int resourceCount = scanner.nextInt();
      int blacksmithNum = scanner.nextInt();
      scanner.nextLine();

      Integer[] numArr = Arrays.stream(scanner.nextLine().split(" "))
              .map(Integer::valueOf)
              .sorted(Comparator.naturalOrder())
              .toArray(Integer[]::new)
              ;

      // 양쪽 끝에 각각 포인터를 두고 움직이면서 조건 확인
      int startIdx = 0;
      int endIdx = numArr.length - 1;
      int counter = 0;
      while (startIdx < endIdx) {
        int sum = numArr[startIdx] + numArr[endIdx];

        if (sum > blacksmithNum) endIdx--;
        else if (sum < blacksmithNum) startIdx++;
        else {
          startIdx++;
          endIdx--;
          counter++;
        }
      }

      System.out.println(counter);
    }
  }
}

// 이 문제는 Do It! 알고리즘 코딩테스트 교재의 투 포인터 실습 문제로 활용되었습니다.
