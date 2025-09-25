package dev.coma.boj.Bronze3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class P6030 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numP = scanner.nextInt();
			int numQ = scanner.nextInt();
			
			List<Integer> listP = new ArrayList<>();
			List<Integer> listQ = new ArrayList<>();
			
			for (int i = 1; i * i <= numP; i++) {
				if (numP % i == 0) {
					listP.add(i);
					listP.add(numP / i);
				}
			}
			
			for (int i = 1; i * i <= numQ; i++) {
				if (numQ % i == 0) {
					listQ.add(i);
					listQ.add(numQ / i);
				}
			}
			
			listP = new ArrayList<>(new HashSet<>(listP));
			listQ = new ArrayList<>(new HashSet<>(listQ));
			
			listP.sort(Comparator.naturalOrder());
			listQ.sort(Comparator.naturalOrder());
			
			for (Integer num1 : listP) {
				for (Integer num2 : listQ) {
					System.out.println(num1 + " " + num2);
				}
			}
		}
	}
}
