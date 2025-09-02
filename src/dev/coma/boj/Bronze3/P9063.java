package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P9063 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int numOfPoint = scanner.nextInt();
			int max_X = -10001, max_Y = -10001, min_X = 10001, min_Y = 10001;
			for (int i = 0; i < numOfPoint; i++) {
			  int x = scanner.nextInt();
			  int y = scanner.nextInt();

			  max_X = Math.max(x, max_X);
			  max_Y = Math.max(y, max_Y);
			  min_X = Math.min(x, min_X);
			  min_Y = Math.min(y, min_Y);
			}

			System.out.println((max_X - min_X) * (max_Y - min_Y));
		}
  }
}
