package dev.coma.boj.Gold1;

import java.io.*;
import java.util.*;

public class P11003 {
  private static final Deque<Node> DEQUE = new ArrayDeque<>();

  private static class Node {
    private int idx;
    private int num;

    public Node(int idx, int num) {
      this.idx = idx;
      this.num = num;
    }
  }

  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {
      String[] input = bufferedReader.readLine().split(" ");
      int numCount = Integer.parseInt(input[0]);
      int length = Integer.parseInt(input[1]);

      Integer[] numArr = Arrays.stream(bufferedReader.readLine().split(" "))
              .map(Integer::valueOf)
              .toArray(Integer[]::new)
              ;

      for (int i = 0; i < numArr.length; i++) {
        if (!DEQUE.isEmpty() && DEQUE.peekFirst().idx == (i - length)) DEQUE.pollFirst();

        insertNode(new Node(i, numArr[i]));
        bufferedWriter.write(DEQUE.peekFirst().num + " ");
      }

      bufferedWriter.flush();
    }
  }

  private static void insertNode(Node node) {
    while (!DEQUE.isEmpty() && DEQUE.peekLast().num >= node.num) DEQUE.pollLast();

    DEQUE.offerLast(node);
  }
}

// 이 문제는 Do It! 알고리즘 코딩테스트 교재의 슬라이딩 윈도우 실습 문제로 활용되었습니다.