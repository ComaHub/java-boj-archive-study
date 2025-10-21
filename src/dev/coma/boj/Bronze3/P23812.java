package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P23812 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int size = scanner.nextInt();
			
			for (int i = 1; i <= 5; i++) {
				if (i % 2 != 0) {
					for (int j = 1; j <= size; j++) {
						for (int k = 1; k <= 5; k++) {
							if (k == 1 || k == 5) {
								for (int l = 1; l <= size; l++) {
									System.out.print("@");
								}
							} else {
								for (int l = 1; l <= size; l++) {
									System.out.print(" ");
								}
							}
						}
						
						System.out.println();
					}
				} else {
					for (int j = 1; j <= size; j++) {
						for (int k = 1; k <= 5; k++) {
							for (int l = 1; l <= size; l++) {
								System.out.print("@");
							}
						}
						
						System.out.println();
					}
				}
			}
		}
	}
}
