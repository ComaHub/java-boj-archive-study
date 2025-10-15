package dev.coma.boj.Silver5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P30088 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = Integer.parseInt(scanner.nextLine());
			List<Long> timeSumList = new ArrayList<>();
			
			for (int i = 0; i < testCase; i++) {
				long sum = 0;
				String[] input = scanner.nextLine().split(" ");
				
				for (int j = 1; j <= Integer.parseInt(input[0]); j++) {
					sum += Long.parseLong(input[j]);
				}
				
				timeSumList.add(sum);
			}
			
			timeSumList.sort(Comparator.naturalOrder());
			long result = timeSumList.get(0);
			long before = result;
			if (timeSumList.size() > 1) {
				for (int i = 1; i < timeSumList.size(); i++) {
					before += timeSumList.get(i);
					result += before;
				}
			}
			
			System.out.println(result);
		}
	}
}
