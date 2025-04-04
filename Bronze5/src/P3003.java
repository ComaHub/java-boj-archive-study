import java.util.Scanner;

public class P3003 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] myPiece = new int[6];
    int[] CHESS_PIECE = {1, 1, 2, 2, 2, 8};

    for (int i = 0; i < myPiece.length; i++) {
      myPiece[i] = CHESS_PIECE[i] - scanner.nextInt();
    }

    for (int piece: myPiece) {
      System.out.print(piece + " ");
    }
  }
}