package dev.coma.boj.Bronze1;

import java.util.Scanner;

public class P1546 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int[] subjects = new int[scanner.nextInt()];
			int max = 0;
			for (int i = 0; i < subjects.length; i++) {
			  subjects[i] = scanner.nextInt();
			  if (subjects[i] > max) {
			    max = subjects[i];
			  }
			}

			double sum = 0;
			for (int subject : subjects) {
			  sum += ((double) subject / max) * 100;
			}

			System.out.println(sum / subjects.length);
		}
  }
}
