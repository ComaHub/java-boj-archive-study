package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P18198 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String[] input = scanner.nextLine().split("");
			
			int teamA = 0;
			int teamB = 0;
			for (int i = 0; i < input.length; i += 2) {
				String team = input[i];
				int point = Integer.parseInt(input[i + 1]);
				
				if ("A".equals(team)) teamA += point;
				else teamB += point;
			}
			
			System.out.println(teamA > teamB ? "A" : "B");
		}
	}
}
