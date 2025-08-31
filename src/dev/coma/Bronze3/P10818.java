package dev.coma.Bronze3;

import java.util.Scanner;

public class P10818 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] numbers = new int[n];

			for (int i = 0; i < numbers.length; i++) {
			  numbers[i] = scanner.nextInt();
			}

			int max = -1000000;
			int min = 1000000;
			for (int number : numbers) {
			  if (number > max) {
			    max = number;
			  }

			  if (number < min) {
			    min = number;
			  }
			}

			System.out.println(min + " " + max);
		}
  }
}
