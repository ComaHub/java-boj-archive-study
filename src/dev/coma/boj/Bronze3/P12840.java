package dev.coma.boj.Bronze3;

import java.time.LocalTime;
import java.util.Scanner;

public class P12840 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			LocalTime nowTime = LocalTime.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
			int testCase = scanner.nextInt();
			
			for (int i = 0; i < testCase; i++) {
				int command = scanner.nextInt();
				
				if (command == 1) nowTime = nowTime.plusSeconds(scanner.nextInt());
				else if (command == 2) nowTime = nowTime.minusSeconds(scanner.nextInt());
				else System.out.println(nowTime.getHour() + " " + nowTime.getMinute() + " " + nowTime.getSecond());
			}
		}
	}
}
