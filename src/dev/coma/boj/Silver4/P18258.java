package dev.coma.boj.Silver4;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class P18258 {
  private static final Queue<String> queue = new ArrayDeque<>();
  private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) {
    try (bufferedReader; bufferedWriter) {
      int testCase = Integer.parseInt(bufferedReader.readLine());
      for (int i = 0; i < testCase; i++) {
        queueService(bufferedReader.readLine());
      }

      bufferedWriter.flush();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void queueService(String input) throws IOException {
    String[] command = input.split(" ");
    switch (command[0]) {
      case "push" -> push(command[1]);
      case "pop" -> pop();
      case "size" -> size();
      case "empty" -> empty();
      case "front" -> front();
      case "back" -> back();
      default -> System.out.println("잘못된 명령입니다.");
    }
  }

  private static void push(String num) {
    queue.offer(num);
  }

  private static void pop() throws IOException {
    bufferedWriter.write(queue.isEmpty() ? "-1\n" : queue.poll() + "\n");
  }

  private static void size() throws IOException {
    bufferedWriter.write(queue.size() + "\n");
  }

  private static void empty() throws IOException {
    bufferedWriter.write(queue.isEmpty() ? "1\n" : "0\n");
  }

  private static void front() throws IOException {
    bufferedWriter.write(queue.isEmpty() ? "-1\n" : queue.peek() + "\n");
  }

  private static void back() throws IOException {
    if (queue.isEmpty()) bufferedWriter.write("-1\n");
    else {
      if (queue instanceof ArrayDeque<?>) {
        ArrayDeque<?> arrayDeque = (ArrayDeque<?>) queue;
        bufferedWriter.write(arrayDeque.peekLast() + "\n");
      }
    }
  }
}
