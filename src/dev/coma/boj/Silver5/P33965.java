package dev.coma.boj.Silver5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P33965 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int num = scanner.nextInt();
      List<Integer> sumList = new ArrayList<>();

      sumList.add(35);
      for (int i = 1; i < num; i++) {
        sumList.add(sumList.get(i - 1) + 70 + (35 * (i - 1)));
      }

      System.out.println(sumList.get(num - 1));
    }
  }
}
