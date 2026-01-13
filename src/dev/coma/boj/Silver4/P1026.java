package dev.coma.boj.Silver4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P1026 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numCount = scanner.nextInt();
      List<Integer> listA = new ArrayList<>();
      List<Integer> listB = new ArrayList<>();

      for (int i = 0; i < numCount; i++) {
        listA.add(scanner.nextInt());
      }

      for (int i = 0; i < numCount; i++) {
        listB.add(scanner.nextInt());
      }

      listA.sort(Comparator.naturalOrder());
      listB.sort(Comparator.reverseOrder());

      int sum = 0;
      for (int i = 0; i < listA.size(); i++) {
        sum += listA.get(i) * listB.get(i);
      }

      System.out.println(sum);
    }
  }
}
