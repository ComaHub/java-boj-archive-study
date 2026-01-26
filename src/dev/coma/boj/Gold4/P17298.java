package dev.coma.boj.Gold4;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class P17298 {
  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {
      int numCount = Integer.parseInt(bufferedReader.readLine());
      Integer[] numArr = Arrays.stream(bufferedReader.readLine().split(" "))
              .map(Integer::valueOf)
              .toArray(Integer[]::new)
              ;

      Deque<Integer> stack = new ArrayDeque<>();
      Integer[] resultArr = new Integer[numArr.length];
      for (int i = 0; i < numCount; i++) {
        while (!stack.isEmpty() && numArr[stack.peek()] < numArr[i]) {
          int idx = stack.pop();
          resultArr[idx] = numArr[i];
        }

         stack.push(i);
      }

      for (Integer num : resultArr) {
        bufferedWriter.write((num == null ? -1 : num) + " ");
      }

      bufferedWriter.flush();
    }
  }
}

// 이 문제는 Do It! 알고리즘 코딩테스트 교재의 스택 실습 문제로 활용되었습니다.