package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P4299 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int sumPoint = scanner.nextInt();
			int gapPoint = scanner.nextInt();

			int myPoint = (sumPoint + gapPoint) / 2;
			int yourPoint = sumPoint - myPoint;

			if ((myPoint - yourPoint) == gapPoint && (myPoint >= 0 && yourPoint >= 0)) {
			  System.out.println(myPoint + " " + yourPoint);
			} else {
			  System.out.println(-1);
			}
		}
  }
}
