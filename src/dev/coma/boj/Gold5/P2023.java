package dev.coma.boj.Gold5;

import java.util.Scanner;

public class P2023 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int inputNum = scanner.nextInt();
      int[] primeNums = {2, 3, 5, 7};

      for (int primeNum : primeNums) {
        process(primeNum, 1, inputNum);
      }
    }
  }

  private static void process(int num, int point, int maxPoint) {
    if (point == maxPoint) {
      if (isPrime(num)) System.out.println(num);
      return;
    }

    for (int i = 1; i <= 9; i += 2) {
      if (isPrime(num)) {
        process((num * 10) + i, point + 1, maxPoint);
      }
    }
  }

  private static boolean isPrime(int num) {
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) return false;
    }

    return true;
  }
}

// 이 문제는 Do It! 알고리즘 코딩테스트 교재의 DFS 실습 문제로 활용되었습니다.