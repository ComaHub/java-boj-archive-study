package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P20673 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int newCase = scanner.nextInt();
			int newHosp = scanner.nextInt();
			
			if (newCase <= 50 && newHosp <= 10) System.out.println("White");
			else if (newHosp > 30) System.out.println("Red");
			else System.out.println("Yellow");
		}
	}
}
