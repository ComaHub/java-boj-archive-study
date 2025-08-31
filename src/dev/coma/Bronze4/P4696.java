package dev.coma.Bronze4;

import java.util.Scanner;

public class P4696 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			  double number = scanner.nextDouble();
			  if (number == 0.0) break;

			  double sum = 1;
			  for (int i = 1; i <= 4; i++) {
			    sum += Math.pow(number, i);
			  }

			  System.out.printf("%.2f\n", sum);
			}
		}
  }
}
