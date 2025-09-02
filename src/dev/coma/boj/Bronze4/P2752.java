package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P2752 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int[] numbers = new int[3];
			int min = 1000001;
			int max = 0;
			for (int i = 0; i < numbers.length; i++) {
			  numbers[i] = scanner.nextInt();
			  if (numbers[i] < min) min = numbers[i];
			  if (numbers[i] > max) max = numbers[i];
			}

			int middle = 0;
			for (int number : numbers) {
			  if (number != min && number != max) {
			    middle = number;
			  }
			}

			System.out.println(min + " " + middle + " " + max);
		}
  }
}
