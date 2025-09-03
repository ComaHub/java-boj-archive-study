package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P25858 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int playerNum = scanner.nextInt();
			int totalPrice = scanner.nextInt();
			
			int[] playerArr = new int[playerNum];
			int totalDivide = 0;
			for (int i = 0; i < playerArr.length; i++) {
				playerArr[i] = scanner.nextInt();
				totalDivide += playerArr[i];
			}
			
			int partPrice = totalPrice / totalDivide;
			for (int part : playerArr) {
				System.out.println(part * partPrice);
			}
		}
	}
	
}
