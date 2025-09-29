package dev.coma.boj.Bronze2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1668 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int count = scanner.nextInt();
			List<Integer> trops = new ArrayList<>();
			
			for (int i = 0; i < count; i++) {
				trops.add(scanner.nextInt());
			}
			
			countTrop(trops);
			Collections.reverse(trops);
			countTrop(trops);
		}
	}
	
	private static void countTrop(List<Integer> trops) {
		int count = 0;
		int max = 0;
		
		for (Integer trop : trops) {
			if (trop > max) {
				count++;
				max = trop;
			}
		}
		
		System.out.println(count);
	}
}
