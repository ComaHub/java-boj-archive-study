package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P4619 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        int numB = scanner.nextInt();
        int numN = scanner.nextInt();

        if (numB == 0 && numN == 0) break;

        int numA = 1;
        while (Math.pow(numA, numN) < numB) {
          numA++;
        }

        if (numB == 1) System.out.println(1);
        else {
          int leftResult = (int) Math.pow(numA - 1, numN);
          int rightResult = (int) Math.pow(numA, numN);

          System.out.println(Math.abs(numB - leftResult) < Math.abs(numB - rightResult) ? numA - 1 : numA);
        }
      }
    }
  }
}
