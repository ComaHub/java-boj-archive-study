package dev.coma.boj.Silver2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class P11725 {
  private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(System.out));

  private static class Node {
    int element;
    Node parentElement;
    List<Node> linkedElement = new ArrayList<>();

    Node(int element) {
      this.element = element;
    }
  }

  public static void main(String[] args) {
    try (BR; BW) {
      int nodeNum = Integer.parseInt(BR.readLine());

      List<Node> nodeList = new ArrayList<>();
      for (int i = 0; i <= nodeNum; i++) {
        nodeList.add(new Node(i));
      }

      for (int i = 0; i < nodeNum - 1; i++) {
        String[] numbers = BR.readLine().split(" ");
        int numA = Integer.parseInt(numbers[0]);
        int numB = Integer.parseInt(numbers[1]);

        nodeList.get(numA).linkedElement.add(nodeList.get(numB));
        nodeList.get(numB).linkedElement.add(nodeList.get(numA));
      }

      findMyParent(nodeList.get(1));
      printParent(nodeList);
      BW.flush();

    } catch (Exception e) { e.printStackTrace(); }
  }

  private static void findMyParent(Node node) {
    for (Node childNode : node.linkedElement) {
      childNode.linkedElement.remove(node);
      childNode.parentElement = node;
    }

    for (Node childNode : node.linkedElement) {
      findMyParent(childNode);
    }
  }

  private static void printParent(List<Node> nodeList) throws IOException {
    for (int i = 2; i < nodeList.size(); i++) {
      BW.write(nodeList.get(i).parentElement.element + "\n");
    }
  }
}
