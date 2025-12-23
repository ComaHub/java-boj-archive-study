package dev.coma.boj.Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P2805 {
  private static int result = 0;

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String[] input = br.readLine().split(" ");
      int treeCount = Integer.parseInt(input[0]);
      int needLength = Integer.parseInt(input[1]);

      List<Integer> treeList = Arrays.stream(br.readLine().split(" "))
                                     .map(Integer::parseInt)
                                     .sorted(Comparator.reverseOrder())
                                     .collect(Collectors.toList());

      findLength(treeList, needLength, treeList.get(0), 0);
    } catch (Exception e) {
      System.err.println(e.getStackTrace()[0]);
    }
  }

  private static void findLength(List<Integer> treeList, int needLength, int maxLength, int minLength) {
    if (minLength > maxLength) {
      System.out.println(result);
      return;
    }

    long totalLength = 0;
    int setLength = (maxLength + minLength) / 2;

    for (Integer tree : treeList) {
      if (tree <= setLength) break;

      totalLength += tree - setLength;
    }

    if (totalLength >= needLength) {
      result = setLength;
      findLength(treeList, needLength, maxLength, (setLength + 1));
    } else {
      findLength(treeList, needLength, (setLength - 1), minLength);
    }

  }
}
