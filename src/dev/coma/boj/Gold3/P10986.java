package dev.coma.boj.Gold3;

import java.util.Scanner;

public class P10986 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // 입력
      int numN = scanner.nextInt();
      int numM = scanner.nextInt();
      scanner.nextLine();

      // 나머지가 적용된 배열 생성
      String[] input = scanner.nextLine().split(" ");
      int[] numArr = new int[input.length];
      for (int i = 0; i < input.length; i++) {
        numArr[i] = Integer.parseInt(input[i]) % numM;
      }

      // 나머지가 적용된 합배열 생성
      int[] sumArr = new int[numArr.length];
      sumArr[0] = numArr[0];
      for (int i = 1; i < sumArr.length; i++) {
        sumArr[i] = (sumArr[i - 1] + numArr[i]) % numM;
      }

      // 합배열 값이 0인 인덱스를 결과에 반영
      long result = 0;
      for (int i : sumArr) {
        if (i == 0) result++;
      }

      // 합배열 값이 동일한 값들을 검색
      for (int i = 0; i < numM; i++) {
        long counter = 0;

        for (int j : sumArr) {
          if (j == i) counter++;
        }

        result += getResult(counter);
      }

      System.out.println(result);
    }
  }

  // 합배열이 동일한 값들 중 2개를 고르는 경우의 수를 반환
  private static long getResult(long counter) {
    return (counter * (counter - 1)) / 2;
  }
}

// 이 문제는 Do It! 알고리즘 코딩테스트 교재의 구간 합 실습 문제로 활용되었습니다.