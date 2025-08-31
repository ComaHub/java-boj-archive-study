package dev.coma.Bronze5;

import java.util.Scanner;

public class P1008 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			double result = (double) a / b;
			System.out.println(result);
		}
  }
}