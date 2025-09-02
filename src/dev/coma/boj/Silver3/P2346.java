package dev.coma.boj.Silver3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P2346 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			Deque<int[]> deque = new ArrayDeque<>();
			StringBuilder stringBuilder;

			int numbers = scanner.nextInt();
			for (int i = 1; i <= numbers; i++) {
			  deque.offer(new int[] {i, scanner.nextInt()});
			}

			stringBuilder = new StringBuilder();
			while (true) {
			  int[] item = deque.poll();
			  stringBuilder.append(item[0] + " ");
			  int move = item[1];

			  if (deque.isEmpty()) break;

			  if (move > 0) {
			    for (int i = 0; i < move - 1; i++) {
			      deque.offer(deque.poll());
			    }
			  } else {
			    for (int i = 0; i < (move * -1); i++) {
			      deque.offerFirst(deque.pollLast());
			    }
			  }
			}

			System.out.println(stringBuilder);
		}
  }
}
