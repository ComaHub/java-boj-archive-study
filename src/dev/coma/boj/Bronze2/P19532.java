package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P19532 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int[] func1 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
			int[] func2 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

			for (int i = -999; i <= 999; i++) {
			  for (int j = -999; j <= 999; j++) {
			    if ((func1[0] * i) + (func1[1] * j) - func1[2] == 0 && (func2[0] * i) + (func2[1] * j) - func2[2] == 0) {
			      System.out.println(i + " " + j);
			      return;
			    }
			  }
			}
		}
  }
}
