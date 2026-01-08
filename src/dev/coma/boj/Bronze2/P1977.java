package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P1977 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numM = scanner.nextInt();
      int numN = scanner.nextInt();

      int minResult = -1;
      int sum = 0;
      for (int i = 1; (i * i) <= numN; i++) {
        int num = i * i;

        if (num >= numM) {
          if (minResult == -1) minResult = num;
          sum += num;
        }
      }

      if (minResult == -1) System.out.println(minResult);
      else {
        System.out.println(sum);
        System.out.println(minResult);
      }
    }
  }
}
