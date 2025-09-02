package dev.coma.boj.Silver2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P1874 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			Deque<Integer> stack = new ArrayDeque<>();
			StringBuilder stringBuilder = new StringBuilder();

			int command = scanner.nextInt();
			int pointer = 0;

			for (int i = 0; i < command; i++) {
			  int inputNum = scanner.nextInt();

			  if (inputNum > pointer) {
			    while (inputNum > pointer) {
			      pointer++;
			      stack.push(pointer);
			      stringBuilder.append("+\n");
			    }

			    stack.pop();
			    stringBuilder.append("-\n");
			  } else if (inputNum < pointer) {
			    int num = stack.pop();
			    if (inputNum != num) {
			      System.out.println("NO");
			      return;
			    }

			    stringBuilder.append("-\n");
			  } else {
			    System.out.println("NO");
			    return;
			  }
			}

			System.out.println(stringBuilder);
		}
  }
}
