package dev.coma.boj.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class P10773 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Deque<Integer> stack = new ArrayDeque<>();

    int numbers = Integer.parseInt(bufferedReader.readLine());
    for (int i = 0; i < numbers; i++) {
      int number = Integer.parseInt(bufferedReader.readLine());
      if (number == 0) {
        stack.pop();
        continue;
      }

      stack.push(number);
    }

    int result = 0;
    while (!stack.isEmpty()) {
      result += stack.pop();
    }

    System.out.println(result);
    bufferedReader.close();
  }
}
