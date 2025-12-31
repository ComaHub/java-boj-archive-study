package dev.coma.boj.Silver5;

import java.util.Scanner;

public class P15803 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int[] pointX = new int[]{scanner.nextInt(), scanner.nextInt()};
      int[] pointY = new int[]{scanner.nextInt(), scanner.nextInt()};
      int[] pointZ = new int[]{scanner.nextInt(), scanner.nextInt()};

      if ((pointX[0] == pointY[0] && pointX[0] == pointZ[0]) || (pointX[1] == pointY[1] && pointX[1] == pointZ[1])) {
        System.out.println("WHERE IS MY CHICKEN?");
        return;
      }

      double inclineXY = (double) (pointX[1] - pointY[1]) / (pointX[0] - pointY[0]);
      double inclineYZ = (double) (pointZ[1] - pointY[1]) / (pointZ[0] - pointY[0]);

      if (inclineXY == inclineYZ) System.out.println("WHERE IS MY CHICKEN?");
      else System.out.println("WINNER WINNER CHICKEN DINNER!");
    }
  }
}
