package dev.coma.Bronze5;

import java.util.Scanner;

public class P11654 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String word = scanner.nextLine();
			char c = word.charAt(0);

			System.out.println((int) c);
		}
  }
}
