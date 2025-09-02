package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P4589 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();

			System.out.println("Gnomes:");
			for (int i = 0; i < testCase; i++) {
			  int firstGnome = scanner.nextInt();
			  int secondGnome = scanner.nextInt();
			  int thirdGnome = scanner.nextInt();

			  if (firstGnome >= secondGnome && secondGnome >= thirdGnome) System.out.println("Ordered");
			  else if (thirdGnome >= secondGnome && secondGnome >= firstGnome) System.out.println("Ordered");
			  else System.out.println("Unordered");
			}
		}
  }
}
