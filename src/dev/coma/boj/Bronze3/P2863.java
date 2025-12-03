package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P2863 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      double numA = scanner.nextDouble();
      double numB = scanner.nextDouble();
      double numC = scanner.nextDouble();
      double numD = scanner.nextDouble();

      double maxResult = -1;
      int count = -1;
      for (int i = 0; i < 4; i++) {
        double result = calc(numA, numB, numC, numD);

        if (result > maxResult) {
          maxResult = result;
          count = i;
        }

        double temp = numA;
        numA = numC;
        numC = numD;
        numD = numB;
        numB = temp;
      }

      System.out.println(count);
    }
  }

  private static double calc(double slotA, double slotB, double slotC, double slotD) {
    return (slotA / slotC) + (slotB / slotD);
  }
}
