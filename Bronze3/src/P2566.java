import java.util.Scanner;

public class P2566 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] numbers = new int[9][9];
    int max = -1;
    int[] maxPoint = new int[2];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        numbers[i][j] = scanner.nextInt();
        if (numbers[i][j] > max) {
          max = numbers[i][j];
          maxPoint[0] = i;
          maxPoint[1] = j;
        }
      }
    }

    System.out.println(max);
    System.out.printf("%d %d", maxPoint[0] + 1, maxPoint[1] + 1);
  }
}
