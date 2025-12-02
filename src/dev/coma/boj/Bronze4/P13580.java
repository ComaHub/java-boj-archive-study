package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P13580 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int[] numbers = new int[3];
      int maxNum = -1;
      for (int i = 0; i < numbers.length; i++) {
        numbers[i] = scanner.nextInt();
        if (numbers[i] > maxNum) {
          maxNum = numbers[i];
        }
      }

      int otherSum = 0;
      for (int num : numbers) {
        if (num != maxNum) otherSum += num;
      }

      if (numbers[0] == numbers[1] || numbers[0] == numbers[2] || numbers[1] == numbers[2]) {
        System.out.println("S");
      } else if (maxNum == otherSum) {
        System.out.println("S");
      } else {
        System.out.println("N");
      }
    }
  }
}
