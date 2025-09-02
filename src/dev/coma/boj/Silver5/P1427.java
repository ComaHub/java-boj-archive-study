package dev.coma.boj.Silver5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1427 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String[] numbers = scanner.nextLine().split("");

			Arrays.sort(numbers, Comparator.reverseOrder());
			System.out.println(String.join("", numbers));
		}
  }
}
