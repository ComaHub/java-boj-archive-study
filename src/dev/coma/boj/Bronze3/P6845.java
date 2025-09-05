package dev.coma.boj.Bronze3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class P6845 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			LocalDate electionDate = LocalDate.of(2007, 2, 27);
			
			for (int i = 0; i < testCase; i++) {
				LocalDate birth = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
				Period lifeTime = Period.between(birth, electionDate);
				
				if (lifeTime.getYears() >= 18) System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}
}
