package dev.coma.Bronze3;

import java.util.Scanner;

public class P23530 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  int numA = scanner.nextInt();
			  int numB = scanner.nextInt();

			  int numC = numA + numB;
			  for (int j = 1; j <= 50; j++) {
			    if (j != numC) {
			      System.out.println(j);
			      break;
			    }
			  }
			}
		}
  }
}
