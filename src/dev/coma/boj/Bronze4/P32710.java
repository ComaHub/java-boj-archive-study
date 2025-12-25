package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P32710 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int num = scanner.nextInt();

      if (num > 81) System.out.println(0);
      else if (num < 10) System.out.println(1);
      else {
        for (int i = 2; i <= 9; i++) {
          if (num <= (i * 9) && num % i == 0) {
            System.out.println(1);
            return;
          }
        }

        System.out.println(0);
      }
    }
  }
}
