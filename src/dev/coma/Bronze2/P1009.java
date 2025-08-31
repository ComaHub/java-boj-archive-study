package dev.coma.Bronze2;

import java.util.Scanner;

public class P1009 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  int numA = scanner.nextInt() % 10;
			  int numB = scanner.nextInt();

			  int result = 1;
			  for (int j = 1; j <= numB; j++) {
			    result *= numA;
			    result %= 10;
			  }

			  if (result == 0) System.out.println(10);
			  else System.out.println(result);
			}
		}
  }
}
