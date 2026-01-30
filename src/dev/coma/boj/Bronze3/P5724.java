package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P5724 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        int inputNum = scanner.nextInt();
        if (inputNum == 0) break;

        long result = 0;
        for (int i = 1; i <= inputNum; i++) {
          result += i * i;
        }

        System.out.println(result);
      }

    }
  }
}
