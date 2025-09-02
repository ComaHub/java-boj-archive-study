package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P5054 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  int[] shops = new int[scanner.nextInt()];

			  int min = 100;
			  int max = 0;
			  for (int j = 0; j < shops.length; j++) {
			    shops[j] = scanner.nextInt();
			    if (shops[j] > max) max = shops[j];
			    if (shops[j] < min) min = shops[j];
			  }

			  System.out.println((max - min) * 2);
			}
		}
  }
}
