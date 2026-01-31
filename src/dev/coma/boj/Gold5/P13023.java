package dev.coma.boj.Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P13023 {
  private static boolean findFriend = false;

  private static class Node {
    private int num;
    private boolean visited;
    private List<Node> friendList = new ArrayList<>();

    public Node(int num) {
      this.num = num;
      this.visited = false;
    }

    public void visit() {
      visited = true;
    }

    public void clear() {
      visited = false;
    }
  }

  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      String[] inputSet = bufferedReader.readLine().split(" ");
      int people = Integer.parseInt(inputSet[0]);
      int relateCount = Integer.parseInt(inputSet[1]);

      Node[] peopleArr = new Node[people];
      for (int i = 0; i < peopleArr.length; i++) {
        peopleArr[i] = new Node(i);
      }

      for (int i = 0; i < relateCount; i++) {
        String[] relate = bufferedReader.readLine().split(" ");
        peopleArr[Integer.parseInt(relate[0])].friendList.add(peopleArr[Integer.parseInt(relate[1])]);
        peopleArr[Integer.parseInt(relate[1])].friendList.add(peopleArr[Integer.parseInt(relate[0])]);
      }

      for (Node node : peopleArr) {
        if (findFriend) break;

        findFriends(node, 1);
        node.clear();
      }

      if (findFriend) System.out.println(1);
      else System.out.println(0);
    }
  }

  private static void findFriends(Node node, int count) {
    if (findFriend) return;

    if (count >= 5) {
      findFriend = true;
      return;
    }

    node.visit();

    for (Node friend : node.friendList) {
      if (!friend.visited) {
        findFriends(friend, count + 1);
        friend.clear();
      }
    }
  }
}
