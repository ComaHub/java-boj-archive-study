package dev.coma.boj.Bronze1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P17224 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			List<Integer> list = new ArrayList<>();

			int numOfProblem = scanner.nextInt();
			int powerOfHJ = scanner.nextInt();
			int limitOfHJ = scanner.nextInt();

			for (int i = 0; i < numOfProblem; i++) {
			  int easyVer = scanner.nextInt();
			  int hardVer = scanner.nextInt();

			  if (powerOfHJ >= hardVer) list.add(140);
			  else if (powerOfHJ >= easyVer) list.add(100);
			  else list.add(0);
			}

			list.sort(Comparator.reverseOrder());

			int sum = 0;
			for (int i = 0; i < limitOfHJ; i++) {
			  sum += list.get(i);
			}

			System.out.println(sum);
		}
  }
}
