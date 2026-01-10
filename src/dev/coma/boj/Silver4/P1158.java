package dev.coma.boj.Silver4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1158 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int peopleCount = scanner.nextInt();
      int eliminateCount = scanner.nextInt();

      List<Integer> peopleList = new ArrayList<>();
      for (int i = 1; i <= peopleCount; i++) {
        peopleList.add(i);
      }

      StringBuilder stringBuilder = new StringBuilder("<");
      int index = eliminateCount - 1;
      while (!peopleList.isEmpty()) {
        if (index >= peopleList.size()) index %= peopleList.size();

        stringBuilder.append(peopleList.remove(index--) + ", ");
        index += eliminateCount;
      }

      stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "");
      stringBuilder.append(">");
      System.out.println(stringBuilder);
    }
  }
}
