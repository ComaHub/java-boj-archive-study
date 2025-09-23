package dev.coma.boj.Bronze1;

import java.util.Scanner;

public class P2435 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int totalTemp = scanner.nextInt();
			int days = scanner.nextInt();
			
			int sum = 0;
			int max = 0;
			int[] temps = new int[totalTemp];
			for (int i = 0; i < totalTemp; i++) {
				temps[i] = scanner.nextInt();
				
				if (i < days - 1) sum += temps[i];
				if (i == days - 1) {
					sum += temps[i];
					max = sum;
				}
				
				if (i > days - 1) {
					sum -= temps[i - days];
					sum += temps[i];
					max = Math.max(max, sum);
				}
			}
			
			System.out.println(max);
		}
	}
}
