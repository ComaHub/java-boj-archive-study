package dev.coma.boj.Silver3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P15652 {
  private static final List<Integer> NUM_LIST = new ArrayList<>();

  public static void main(String[] args) {
    int maxNum, selectCount;
    try (Scanner scanner = new Scanner(System.in)) {
      maxNum = scanner.nextInt();
      selectCount = scanner.nextInt();
    }

    selectInt(maxNum, selectCount, 0, 1);
  }

  private static void selectInt(int maxNum, int selectCount, int counter, int num) {
    if (counter == selectCount) {
      for (Integer i : NUM_LIST) {
        System.out.print(i + " ");
      }

      System.out.println();
      return;
    }

    for (int i = num; i <= maxNum; i++) {
      NUM_LIST.add(i);
      selectInt(maxNum, selectCount, counter + 1, i);
      NUM_LIST.remove(Integer.valueOf(i));
    }
  }
}
