package dev.coma.boj.Silver4;

import java.io.*;
import java.util.ArrayDeque;

public class P28278 {
  private static final ArrayDeque<String> stack = new ArrayDeque<>();
  private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) {
    try (bufferedReader; bufferedWriter ) {
      int testCase = Integer.parseInt(bufferedReader.readLine());
      for (int i = 0; i < testCase; i++) {
        stackService(bufferedReader.readLine());
      }

      bufferedWriter.flush();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void stackService(String input) throws IOException {
    String[] command = input.split(" ");
    switch (command[0]) {
      case "1" -> push(command[1]);
      case "2" -> pop();
      case "3" -> size();
      case "4" -> empty();
      case "5" -> peek();
      default -> System.out.println("잘못된 명령입니다.");
    }
  }

  private static void push(String num) {
    stack.push(num);
  }

  private static void pop() throws IOException {
    bufferedWriter.write(stack.isEmpty() ? "-1\n" : stack.pop() + "\n");
  }

  private static void size() throws IOException {
    bufferedWriter.write(stack.size() + "\n");
  }

  private static void empty() throws IOException {
    bufferedWriter.write(stack.isEmpty() ? "1\n" : "0\n");
  }

  private static void peek() throws IOException {
    bufferedWriter.write(stack.isEmpty() ? "-1\n" : stack.peek() + "\n");
  }
}
