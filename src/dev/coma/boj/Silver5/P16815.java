package dev.coma.boj.Silver5;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P16815 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      ArrayDeque<String> stack = new ArrayDeque<>();
      String[] inputArr = scanner.nextLine().split("");

      for (int i = 0; i < inputArr.length; i++) {
        String input = inputArr[i];

        if ("(".equals(input)) {
          stack.push("KUMORIN");
        } else if (")".equals(input)) {
          stack.pop();
        } else if ("*".equals(input)) {
          System.out.println(stack.size());
          return;
        }
      }
    }
  }
}
