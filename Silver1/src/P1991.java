import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1991 {
  private static final List<String> ORDER_LIST = new ArrayList<>();

  private static class Node {
    char element;
    Node leftNode;
    Node rightNode;

    Node(char element) {
      this.element = element;
    }

  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int nodeNum = Integer.parseInt(scanner.nextLine());
      List<Node> nodeList = new ArrayList<>();

      char c = 'A';
      for (int i = 0; i < nodeNum; i++) {
        nodeList.add(new Node(c++));
      }

      StringTokenizer stringTokenizer;
      for (int i = 0; i < nodeNum; i++) {
        stringTokenizer = new StringTokenizer(scanner.nextLine(), " ");
        Node thisNode = nodeList.get(stringTokenizer.nextToken().charAt(0) - 'A');

        String left = stringTokenizer.nextToken();
        if (!left.equals(".")) {
          thisNode.leftNode = nodeList.get(left.charAt(0) - 'A');
        }

        String right = stringTokenizer.nextToken();
        if (!right.equals(".")) {
          thisNode.rightNode = nodeList.get(right.charAt(0) - 'A');
        }
      }

      preorder(nodeList.get(0));
      printOrderList();

      inorder(nodeList.get(0));
      printOrderList();

      postorder(nodeList.get(0));
      printOrderList();
    }
  }

  private static void preorder(Node node) {
    if (node == null) return;

    ORDER_LIST.add(String.valueOf(node.element));
    preorder(node.leftNode);
    preorder(node.rightNode);

  }

  private static void inorder(Node node) {
    if (node == null) return;

    inorder(node.leftNode);
    ORDER_LIST.add(String.valueOf(node.element));
    inorder(node.rightNode);

  }

  private static void postorder(Node node) {
    if (node == null) return;

    postorder(node.leftNode);
    postorder(node.rightNode);
    ORDER_LIST.add(String.valueOf(node.element));

  }

  private static void printOrderList() {
    for (String str : ORDER_LIST) {
      System.out.print(str);
    }

    System.out.println();
    ORDER_LIST.clear();
  }
}
