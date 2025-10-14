package dev.coma.boj.Bronze1;

import java.util.Scanner;

public class P29196 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String input = scanner.nextLine();
			String beforePoint = input.substring(input.indexOf(".") + 1);
			String pointTrim = null;
			for (int i = 0; i < beforePoint.length(); i++) {
				if (beforePoint.charAt(i) != '0') {
					pointTrim = beforePoint.substring(i);
					break;
				}
			}
			
			System.out.println("YES");
			System.out.println(pointTrim + " " + (1 + "0".repeat(beforePoint.length())));
		}
	}
}
