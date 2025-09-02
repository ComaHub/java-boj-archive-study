package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P32902 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int canNum = scanner.nextInt();
			int chipNum = scanner.nextInt();

			System.out.println((chipNum + 1) + " " + ((chipNum * canNum) + 1));
		}
  }
}
