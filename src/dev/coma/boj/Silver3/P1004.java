package dev.coma.boj.Silver3;

import java.util.Scanner;

public class P1004 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  int[] startPoint = {scanner.nextInt(), scanner.nextInt()};
			  int[] endPoint = {scanner.nextInt(), scanner.nextInt()};

			  int count = 0;
			  int planets = scanner.nextInt();
			  for (int j = 0; j < planets; j++) {
			    int[] planetPoint = {scanner.nextInt(), scanner.nextInt()};
			    int planetR = scanner.nextInt();

			    if (getStraightLength(startPoint, planetPoint) < (planetR * planetR) &&
			            getStraightLength(endPoint, planetPoint) < (planetR * planetR)) continue;

			    if (getStraightLength(startPoint, planetPoint) < (planetR * planetR)) count++;
			    if (getStraightLength(endPoint, planetPoint) < (planetR * planetR)) count++;
			  }

			  System.out.println(count);
			}
		}
  }

  static int getStraightLength(int[] point1, int[] point2) {
    return (int) (Math.pow((point1[0] - point2[0]), 2) + Math.pow((point1[1] - point2[1]), 2));
  }
}
