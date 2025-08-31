package dev.coma.Silver5;

import java.util.Scanner;

public class P1676 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();
			System.out.println((number / 5) + (number / 25) + (number / 125));
		}
  }
}
