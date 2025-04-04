import java.util.Scanner;

public class P2738 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int[][] matrix1 = setMatrix(scanner, n, m);
    int[][] matrix2 = setMatrix(scanner, n, m);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix1[i][j] + matrix2[i][j] + " ");
      }

      System.out.println();
    }
  }

  public static int[][] setMatrix(Scanner scanner, int n, int m) {
    int[][] matrix = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    return matrix;
  }
}
