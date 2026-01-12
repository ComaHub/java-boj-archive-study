package dev.coma.boj.Bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class P17608 {
  public static void main(String[] args) {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      Deque<Integer> stack = new ArrayDeque<>();
      int count = Integer.parseInt(bufferedReader.readLine());

      for (int i = 0; i < count; i++) {
        stack.push(Integer.parseInt(bufferedReader.readLine()));
      }

      int result = 0;
      int height = 0;
      for (int i = 0; i < count; i++) {
        int num = stack.pop();

        if (num > height) {
          height = num;
          result++;
        }
      }

      System.out.println(result);
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }
  }
}
