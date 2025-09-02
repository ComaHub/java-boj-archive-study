package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P30224 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();
			String numberString = Integer.toString(number);

			if ((numberString.contains("7")) && (number % 7 == 0)) {
			  System.out.println(3);
			} else if ((numberString.contains("7")) && (number % 7 != 0)) {
			  System.out.println(2);
			} else if ((!numberString.contains("7")) && (number % 7 == 0)) {
			  System.out.println(1);
			} else {
			  System.out.println(0);
			}
		}
  }
}
