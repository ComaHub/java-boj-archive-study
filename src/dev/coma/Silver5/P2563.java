package dev.coma.Silver5;

import java.util.Scanner;

public class P2563 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int[][] paper = new int[100][100];

			int blackPapers = scanner.nextInt();
			int count = 0;
			for (int i = 0; i < blackPapers; i++) {
			  int pointX = scanner.nextInt();
			  int pointY = scanner.nextInt();

			  for (int x = pointX; x < pointX + 10; x++) {
			    for (int y = pointY; y < pointY + 10; y++) {
			      if (paper[x][y] == 0) {
			        paper[x][y] = 1;
			        count++;
			      }
			    }
			  }
			}

			System.out.println(count);
		}
  }
}
