package dev.coma.boj.Silver4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P12000 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int rooms = scanner.nextInt();
      List<Integer> cowInRoomList = new ArrayList<>();

      for (int i = 0; i < rooms; i++) {
        cowInRoomList.add(scanner.nextInt());
      }

      int minMove = calculateStep(cowInRoomList, 0);
      for (int i = 1; i < rooms; i++) {
        int move = calculateStep(cowInRoomList, i);

        if (minMove > move) minMove = move;
      }

      System.out.println(minMove);
    }
  }

  private static int calculateStep(List<Integer> list, int doorIndex) {
   int result = 0;
   int moveCount = 0;
   int pointer = doorIndex;

   for (int i = 0; i < list.size() - 1; i++) {
     if (++pointer > (list.size() - 1)) pointer = 0;
     moveCount++;

     result += list.get(pointer) * moveCount;
   }

   return result;
  }
}
