package dev.coma.Bronze5;

import java.util.Scanner;

public class P27866 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String word = scanner.nextLine();
			int charIndex = scanner.nextInt() - 1;

			char c = word.charAt(charIndex);
			System.out.println(c);
		}
  }
}
