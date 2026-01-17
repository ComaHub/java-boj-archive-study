package dev.coma.boj.Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P11724 {
  private static class Node {
    private boolean visit;
    private List<Node> linkList;

    public Node() {
      this.visit = false;
      this.linkList = new ArrayList<>();
    }

    public void visit() {
      this.visit = true;
    }
  }

  public static void main(String[] args) {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      String[] input = bufferedReader.readLine().split(" ");
      int nodeCount = Integer.parseInt(input[0]);
      int linkCount = Integer.parseInt(input[1]);

      Node[] graph = new Node[nodeCount + 1];
      for (int i = 1; i <= nodeCount; i++) {
        graph[i] = new Node();
      }

      // 더미 노드
      graph[0] = new Node();
      graph[0].visit();

      for (int i = 0; i < linkCount; i++) {
        String[] inputLink = bufferedReader.readLine().split(" ");
        Node leftNode = graph[Integer.parseInt(inputLink[0])];
        Node rightNode = graph[Integer.parseInt(inputLink[1])];

        leftNode.linkList.add(rightNode);
        rightNode.linkList.add(leftNode);
      }

      System.out.println(countAllConnection(graph));
    } catch (IOException e) {
      e.printStackTrace(System.out);
    }
  }

  private static int countAllConnection(Node[] graph) {
    int counter = 0;

    for (Node node : graph) {
      if (!node.visit) {
        visitAllLinkedNode(node);
        counter++;
      }
    }

    return counter;
  }

  private static void visitAllLinkedNode(Node node) {
    if (node.visit) return;

    node.visit();

    for (Node linkedNode : node.linkList) {
      if (!linkedNode.visit) visitAllLinkedNode(linkedNode);
    }
  }
}
