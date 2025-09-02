package dev.coma.boj.Silver4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class P4949 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			Deque<String> stack = new ArrayDeque<>();

			Master:
			while (true) {
			  String[] line = scanner.nextLine().split("");
			  if (".".equals(line[0])) break;

			  stack.clear();
			  for (int i = 0; i < line.length; i++) {
			    switch (line[i]) {
			      case "(" -> stack.push("(");
			      case "[" -> stack.push("[");

			      case ")" -> {
			        try {
			          String item = stack.pop();

			          if (!"(".equals(item)) {
			            System.out.println("no");
			            continue Master;
			          }
			        } catch (NoSuchElementException e) {
			          System.out.println("no");
			          continue Master;
			        }
			      }

			      case "]" -> {
			        try {
			          String item = stack.pop();

			          if (!"[".equals(item)) {
			            System.out.println("no");
			            continue Master;
			          }
			        } catch (NoSuchElementException e) {
			          System.out.println("no");
			          continue Master;
			        }
			      }

			      default -> {}
			    }
			  }

			  if (stack.isEmpty()) System.out.println("yes");
			  else System.out.println("no");
			}
		}
  }
}
