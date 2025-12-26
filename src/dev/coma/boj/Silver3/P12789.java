package dev.coma.boj.Silver3;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P12789 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int studentCount = scanner.nextInt();
      ArrayDeque<Integer> lineQueue = new ArrayDeque<>();
      ArrayDeque<Integer> waitStack = new ArrayDeque<>();

      for (int i = 0; i < studentCount; i++) {
        lineQueue.offer(scanner.nextInt());
      }

      int passNum = 1;
      while (!lineQueue.isEmpty() || !waitStack.isEmpty()) {
        if (!waitStack.isEmpty() && waitStack.peek() == passNum) {
          waitStack.pop();
          passNum++;
          continue;
        }

        if (!lineQueue.isEmpty()) {
          int input = lineQueue.poll();

          if (passNum == input) {
            passNum++;
            continue;
          } else if (waitStack.isEmpty() || waitStack.peek() > input) {
            waitStack.push(input);
            continue;
          }
        }

        System.out.println("Sad");
        return;
      }

      System.out.println("Nice");
    }
  }
}
