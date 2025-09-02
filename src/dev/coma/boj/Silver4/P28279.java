package dev.coma.boj.Silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class P28279 {
  private static final Deque<String> deque = new ArrayDeque<>();
  private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) {
    try (bufferedReader; bufferedWriter) {
      int testCase = Integer.parseInt(bufferedReader.readLine());
      for (int i = 0; i < testCase; i++) {
        dequeService(bufferedReader.readLine());
      }

      bufferedWriter.flush();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void dequeService(String input) throws Exception {
    String[] command = input.split(" ");
    switch (command[0]) {
      case "1" -> offerFirst(command[1]);
      case "2" -> offerLast(command[1]);
      case "3" -> pollFirst();
      case "4" -> pollLast();
      case "5" -> size();
      case "6" -> empty();
      case "7" -> peekFirst();
      case "8" -> peekLast();
      default -> System.out.println("잘못된 명령입니다.");
    }
  }

  private static void offerFirst(String num) {
    deque.offerFirst(num);
  }

  private static void offerLast(String num) {
    deque.offerLast(num);
  }

  private static void pollFirst() throws Exception {
    bufferedWriter.write(deque.isEmpty() ? "-1\n" : deque.pollFirst() + "\n");
  }

  private static void pollLast() throws Exception {
    bufferedWriter.write(deque.isEmpty() ? "-1\n" : deque.pollLast() + "\n");
  }

  private static void size() throws Exception {
    bufferedWriter.write(deque.size() + "\n");
  }

  private static void empty() throws Exception {
    bufferedWriter.write(deque.isEmpty() ? "1\n" : "0\n");
  }

  private static void peekFirst() throws Exception {
    bufferedWriter.write(deque.isEmpty() ? "-1\n" : deque.peekFirst() + "\n");
  }

  private static void peekLast() throws Exception {
    bufferedWriter.write(deque.isEmpty() ? "-1\n" : deque.peekLast() + "\n");
  }
}
