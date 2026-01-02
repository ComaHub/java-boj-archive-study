package dev.coma.boj.Silver5;

import java.util.*;

public class P2161 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      Queue<Integer> queue = new ArrayDeque<>();
      int num = scanner.nextInt();

      for (int i = 1; i <= num; i++) {
        queue.offer(i);
      }

      List<String> resultList = new ArrayList<>();
      while (!queue.isEmpty()) {
        resultList.add(String.valueOf(queue.poll()));

        if (!queue.isEmpty()) {
          queue.offer(queue.poll());
        }
      }

      System.out.println(String.join(" ", resultList));
    }
  }
}
