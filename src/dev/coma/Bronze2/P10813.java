package dev.coma.Bronze2;

import java.util.Scanner;

public class P10813 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int[] buckets = new int[scanner.nextInt()];
			for (int i = 0; i < buckets.length; i++) {
			  buckets[i] = i + 1;
			}

			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  int a = scanner.nextInt() - 1;
			  int b = scanner.nextInt() - 1;

			  int temp = buckets[a];
			  buckets[a] = buckets[b];
			  buckets[b] = temp;
			}

			for (int bucket : buckets) {
			  System.out.print(bucket + " ");
			}
		}
  }
}
