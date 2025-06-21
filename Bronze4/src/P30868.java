import java.util.Scanner;

public class P30868 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int candidates = scanner.nextInt();
    for (int i = 0; i < candidates; i++) {
      int votes = scanner.nextInt();

      int voteFive = votes / 5;
      int voteOne = votes % 5;

      for (int j = 0; j < voteFive; j++) {
        System.out.print("++++ ");
      }

      for (int j = 0; j < voteOne; j++) {
        System.out.print("|");
      }

      System.out.println();
    }
  }
}
