package dev.coma.Bronze4;

import java.util.Scanner;

public class P10039 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int sum = 0;
			for (int i = 0; i < 5; i++) {
			  int grade = scanner.nextInt();
			  sum += Math.max(grade, 40);
			}

			System.out.println(sum / 5);
		}
  }
}
