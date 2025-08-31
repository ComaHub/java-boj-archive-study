package dev.coma.Bronze2;

import java.util.Scanner;

public class P10539 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int[] sumArrOfA = new int[scanner.nextInt()];
			for (int i = 0; i < sumArrOfA.length; i++) {
			  sumArrOfA[i] = scanner.nextInt() * (i + 1);
			}

			int[] arrA = new int[sumArrOfA.length];
			arrA[0] = sumArrOfA[0];
			for (int i = 1; i < arrA.length; i++) {
			  arrA[i] = sumArrOfA[i] - sumArrOfA[i - 1];
			}

			for (int i : arrA) {
			  System.out.print(i + " ");
			}
		}
  }
}
