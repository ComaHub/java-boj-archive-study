package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P17009 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int pointA = 0;
			int pointB = 0;
			
			for (int i = 3; i >= 1; i--) {
				pointA += scanner.nextInt() * i;
			}
			
			for (int i = 3; i >= 1; i--) {
				pointB += scanner.nextInt() * i;
			}
			
			System.out.println(pointA > pointB ? "A" : pointA < pointB ? "B" : "T");
		}
	}
}
