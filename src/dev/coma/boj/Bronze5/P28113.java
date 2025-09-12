package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P28113 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int walkTime = scanner.nextInt();
			int busTime = scanner.nextInt();
			int subwayTime = scanner.nextInt();
			
			if (subwayTime > busTime || (subwayTime < busTime && walkTime > subwayTime)) {
				System.out.println("Bus");
			} else if (busTime > subwayTime) {
				System.out.println("Subway");
			} else {
				System.out.println("Anything");
			}
		}
	}
}
