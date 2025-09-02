package dev.coma.boj.Bronze2;

import java.util.Scanner;
import java.util.Stack;

public class P10811 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int[] buckets = new int[scanner.nextInt()];
			for (int i = 0; i < buckets.length; i++) {
			  buckets[i] = i + 1;
			}

			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  int n = scanner.nextInt() - 1;
			  int m = scanner.nextInt() - 1;
			  Stack<Integer> stack = new Stack<>();

			  for (int j = n; j <= m; j++) {
			    stack.push(buckets[j]);
			  }

			  for (int j = n; j <= m; j++) {
			    buckets[j] = stack.pop();
			  }
			}

			for (int i = 0; i < buckets.length; i++) {
			  System.out.print(buckets[i]);
			  if (i != buckets.length - 1) System.out.print(" ");
			}
		}
  }
}
