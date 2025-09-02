package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P19602 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int smallTreats = scanner.nextInt();
			int mediumTreats = scanner.nextInt();
			int largeTreats = scanner.nextInt();

			int result = smallTreats + (2 * mediumTreats) + (3 * largeTreats);
			if (result >= 10) {
			  System.out.println("happy");
			} else {
			  System.out.println("sad");
			}
		}
  }
}
