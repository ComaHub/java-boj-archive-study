package dev.coma.Gold4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P5639 {
  private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(System.out));

  private static class Node {
    int element;
    Node leftNode;
    Node rightNode;

    Node(int element) {
      this.element = element;
    }
  }

  public static void main(String[] args) {
    try (BR; BW) {
      Node rootNode = new Node(Integer.parseInt(BR.readLine()));

      while (true) {
        String input = BR.readLine();
        if (input == null) break;

        int number = Integer.parseInt(input);
        insertNode(rootNode, number);
      }

      postorder(rootNode);
      BW.flush();
    } catch (Exception e) { e.printStackTrace(); }
  }

  private static void insertNode(Node node, int number) {
    if (node.element > number) {
      if (node.leftNode == null) node.leftNode = new Node(number);
      else insertNode(node.leftNode, number);
    } else {
      if (node.rightNode == null) node.rightNode = new Node(number);
      else insertNode(node.rightNode, number);
    }
  }

  private static void postorder(Node node) throws Exception {
    if (node == null) return;

    postorder(node.leftNode);
    postorder(node.rightNode);
    BW.write(node.element + "\n");

  }
}
