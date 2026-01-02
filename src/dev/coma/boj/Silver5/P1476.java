package dev.coma.boj.Silver5;

import java.util.Scanner;

public class P1476 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int earth = scanner.nextInt();
      int sun = scanner.nextInt();
      int moon = scanner.nextInt();

      int count = 1;
      int[] year = {1, 1, 1};
      while (true) {
        if (year[0] == earth && year[1] == sun && year[2] == moon) break;

        if (++year[0] > 15) year[0] -= 15;
        if (++year[1] > 28) year[1] -= 28;
        if (++year[2] > 19) year[2] -= 19;
        count++;
      }

      System.out.println(count);
    }
  }
}
