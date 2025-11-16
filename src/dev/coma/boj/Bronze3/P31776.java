package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P31776 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			int count = 0;
			
			Master:
			for (int i = 0; i < testCase; i++) {
				int[] input = new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
				if (input[0] == -1 && input[1] == -1 && input[2] == -1) continue;
				
				for (int j = 1; j < input.length; j++) {
					if (input[j] == -1) continue;
					else {
						if (input[j - 1] == -1) continue Master;
						if (input[j - 1] > input[j]) continue Master;
					}
				}
				
				count++;
			}
			
			System.out.println(count);
		}
	}
}
