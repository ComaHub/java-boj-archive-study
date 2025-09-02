package dev.coma.boj.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class P10845 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Queue<Integer> queue = new ArrayDeque<>();

    int inputNumCommand = Integer.parseInt(bufferedReader.readLine());
    for (int i = 0; i < inputNumCommand; i++) {
      String[] command = bufferedReader.readLine().split(" ");

      switch (command[0]) {
        case "push" -> queue.offer(Integer.valueOf(command[1]));

        case "pop" -> {
          Integer num = queue.poll();
          System.out.println(num == null ? -1 : num);
        }

        case "size" -> System.out.println(queue.size());

        case "empty" -> System.out.println(queue.isEmpty() ? 1 : 0);

        case "front" -> System.out.println(queue.peek() == null ? -1 : queue.peek());

        case "back" -> {
          ArrayDeque<Integer> temp = (ArrayDeque<Integer>) queue;
          System.out.println(temp.peekLast() == null ? -1 : temp.peekLast());
        }

        default -> {}
      }
    }
    
    bufferedReader.close();
  }
}
