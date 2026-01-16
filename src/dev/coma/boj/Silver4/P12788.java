package dev.coma.boj.Silver4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P12788 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int memberCount = scanner.nextInt();
      int teamCount = scanner.nextInt();
      int peoplePerTeam = scanner.nextInt();
      scanner.nextLine();

      List<Integer> memberPenList = Arrays.stream(scanner.nextLine().split(" "))
              .map(Integer::valueOf)
              .sorted(Comparator.reverseOrder())
              .collect(Collectors.toList())
              ;

      int needPenTotal = teamCount * peoplePerTeam;
      int sum = 0;
      int count = 0;
      for (Integer pen : memberPenList) {
        sum += pen;
        count++;

        if (sum >= needPenTotal) break;
      }

      System.out.println((sum < needPenTotal) ? "STRESS" : count);
    }
  }
}
