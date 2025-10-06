package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P28691 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String input = scanner.nextLine();
			
			switch (input) {
				case "M" -> System.out.println("MatKor");
				case "W" -> System.out.println("WiCys");
				case "C" -> System.out.println("CyKor");
				case "A" -> System.out.println("AlKor");
				case "$" -> System.out.println("$clear");
			}
		}
	}
}
