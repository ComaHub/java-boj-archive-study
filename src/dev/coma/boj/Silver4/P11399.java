package dev.coma.boj.Silver4;

import java.util.Arrays;
import java.util.Scanner;

public class P11399 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int[] people = new int[scanner.nextInt()];
			for (int i = 0; i < people.length; i++) {
			  people[i] = scanner.nextInt();
			}

			Arrays.sort(people);
			int[] sumTimeArr = new int[people.length];
			sumTimeArr[0] = people[0];
			for (int i = 1; i < sumTimeArr.length; i++) {
			  sumTimeArr[i] = sumTimeArr[i - 1] + people[i];
			}

			int sumOfSum = 0;
			for (int i : sumTimeArr) {
			  sumOfSum += i;
			}

			System.out.println(sumOfSum);
		}
  }
}
