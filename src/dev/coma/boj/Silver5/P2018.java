package dev.coma.boj.Silver5;

import java.util.Scanner;

public class P2018 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int inputNum = scanner.nextInt();
      int startNum = 1;
      int endNum = 1;

      // 포인터를 이용해 연속된 자연수의 합을 계산
      int counter = 1;
      int sum = 1;
      while (endNum != inputNum) {
        if (sum > inputNum) {
          sum -= startNum++;
        } else if (sum < inputNum) {
          sum += ++endNum;
        } else {
          counter++;
          sum += ++endNum;
        }
      }

      System.out.println(counter);
    }
  }
}

// 이 문제는 Do It! 알고리즘 코딩테스트 교재의 투 포인터 실습 문제로 활용되었습니다.