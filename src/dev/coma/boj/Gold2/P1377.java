package dev.coma.boj.Gold2;

import java.io.*;
import java.util.Arrays;

public class P1377 {

  private static class Node {
    private int beforeIdx;
    private int value;

    public Node(int beforeIdx, int value) {
      this.beforeIdx = beforeIdx;
      this.value = value;
    }
  }

  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      int numCount = Integer.parseInt(bufferedReader.readLine());
      Node[] nodeArr = new Node[numCount];

      for (int i = 0; i < nodeArr.length; i++) {
        nodeArr[i] = new Node(i, Integer.parseInt(bufferedReader.readLine()));
      }

      // N이 500,000까지 -> O(n^2)인 단순 버블정렬 사용 시 시간 부족
      // 버블 정렬에서 1회 루프 시 데이터의 왼쪽 방향 최대 이동 거리는 1인 점을 활용
      Arrays.sort(nodeArr, (obj1, obj2) -> {
        return Integer.compare(obj1.value, obj2.value);
      });

      int maxMove = -1;
      for (int i = 0; i < nodeArr.length; i++) {
        int move = nodeArr[i].beforeIdx - i;
        if (move > maxMove) maxMove = move;
      }

      System.out.println(maxMove + 1);
    }
  }
}

// 이 문제는 Do It! 알고리즘 코딩테스트 교재의 버블 정렬 실습 문제로 활용되었습니다.