package dev.coma.boj.Silver4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P3211 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int friendCount = scanner.nextInt();
      List<Integer> friendList = new ArrayList<>();

      for (int i = 0; i < friendCount; i++) {
        friendList.add(scanner.nextInt());
      }

      friendList.sort(Comparator.naturalOrder());

      int minFriend = friendCount + 1;
      List<Integer> minFriendList = new ArrayList<>();
      Master:
      for (int i = 0; i < friendList.size(); i++) {
        minFriendList.clear();
        int thisFriendWants = friendList.get(i);

        if (thisFriendWants > i) {
          for (int j = 0; j < thisFriendWants + 1; j++) {
            minFriendList.add(friendList.get(j));
          }
        } else {
          for (int j = 0; j < thisFriendWants; j++) {
            minFriendList.add(friendList.get(j));
          }

          minFriendList.add(friendList.get(i));
        }

        for (Integer count : minFriendList) {
          if (count > thisFriendWants) continue Master;
        }

        if (minFriend > thisFriendWants + 1) minFriend = thisFriendWants + 1;
      }

      System.out.println(minFriend);
    }
  }
}
