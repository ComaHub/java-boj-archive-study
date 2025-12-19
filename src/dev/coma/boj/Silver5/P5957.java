package dev.coma.boj.Silver5;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P5957 {
  public static void main(String[] args) {
    ArrayDeque<Integer> washStack = new ArrayDeque<>();
    ArrayDeque<Integer> dryStack = new ArrayDeque<>();

    try (Scanner scanner = new Scanner(System.in)) {
      int dishCount = scanner.nextInt();
      int dishNum = 1;

      while (scanner.hasNext()) {
        int command = scanner.nextInt();

        if (command == 1) {
          int orderCount = scanner.nextInt();

          for (int i = 0; i < orderCount; i++) {
            washStack.push(dishNum++);
          }
        } else {
          int orderCount = scanner.nextInt();

          for (int i = 0; i < orderCount; i++) {
            dryStack.push(washStack.pop());
          }
        }
      }

      for (Integer num : dryStack) {
        System.out.println(num);
      }
    }
  }
}
