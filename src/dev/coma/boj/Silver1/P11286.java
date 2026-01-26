package dev.coma.boj.Silver1;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class P11286 {
  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {
      int commandCount = Integer.parseInt(bufferedReader.readLine());
      Queue<Integer> queue = new PriorityQueue<>((num1, num2) -> {
        int absNum1 = Math.abs(num1);
        int absNum2 = Math.abs(num2);

        if (absNum1 == absNum2) return Integer.compare(num1, num2);
        else return Integer.compare(absNum1, absNum2);
      });

      for (int i = 0; i < commandCount; i++) {
        int command = Integer.parseInt(bufferedReader.readLine());

        if (command != 0) queue.offer(command);
        else {
          if (queue.isEmpty()) bufferedWriter.write(0 + "\n");
          else bufferedWriter.write(queue.poll() + "\n");
        }
      }

      bufferedWriter.flush();
    }
  }
}
