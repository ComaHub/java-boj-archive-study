package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P25285 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
				double height = scanner.nextDouble();
				double weight = scanner.nextDouble();
				double bmi = weight / ((height * 0.01) * (height * 0.01));
				
				if (height < 140.1) System.out.println(6);
				else if (height < 146) System.out.println(5);
				else if (height < 159) System.out.println(4);
				else if (height < 161) {
					if (bmi >= 16.0 && bmi < 35) System.out.println(3);
					else System.out.println(4);
				} else if (height < 204) {
					if (bmi >= 20 && bmi < 25) System.out.println(1);
					else if (bmi >= 18.5 && bmi < 30) System.out.println(2);
					else if (bmi >= 16 && bmi < 35) System.out.println(3);
					else System.out.println(4);
				} else System.out.println(4);
			}
		}
	}
}
