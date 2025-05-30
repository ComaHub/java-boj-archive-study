import java.util.Scanner;

public class P7568 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] muscleman = new int[scanner.nextInt()][2];
    for (int i = 0; i < muscleman.length; i++) {
      muscleman[i][0] = scanner.nextInt();
      muscleman[i][1] = scanner.nextInt();
    }

    for (int i = 0; i < muscleman.length; i++) {
      int count = 1;
      for (int j = 0; j < muscleman.length; j++) {
        if (muscleman[i][0] < muscleman[j][0] && muscleman[i][1] < muscleman[j][1]) count++;
      }

      System.out.print(count + " ");
    }
  }
}
