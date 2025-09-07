package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P2511 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String[] cardA = scanner.nextLine().split(" "); 
			String[] cardB = scanner.nextLine().split(" "); 
			
			int scoreA = 0;
			int scoreB = 0;
			String lastWinner = null;
			for (int i = 0; i < 10; i++) {
				int pointA = Integer.parseInt(cardA[i]);
				int pointB = Integer.parseInt(cardB[i]);
				
				if (pointA == pointB) {
					scoreA++;
					scoreB++;
				} else {
					if (pointA > pointB) scoreA += 3;
					else scoreB += 3;
				}
				
				if (pointA != pointB) {
					lastWinner = pointA > pointB ? "A" : "B";
				}
			}
			
			System.out.println(scoreA + " " + scoreB);
			if (scoreA == scoreB) {
				System.out.println(lastWinner == null ? "D" : lastWinner);
			} else {
				System.out.println(scoreA > scoreB ? "A" : "B");
			}
		}
	}
}
