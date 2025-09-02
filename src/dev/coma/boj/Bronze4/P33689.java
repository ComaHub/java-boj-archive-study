package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P33689 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int candidates = scanner.nextInt();
			int count = 0;
			scanner.nextLine();

			for (int i = 0; i < candidates; i++) {
			  String candidate = scanner.nextLine();
			  if (candidate.charAt(0) == 'C') count++;
			}

			System.out.println(count);
		}
  }
}
