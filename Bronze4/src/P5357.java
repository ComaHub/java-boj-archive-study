import java.util.Scanner;

public class P5357 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int wordNum = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < wordNum; i++) {
      String[] words = scanner.nextLine().split("");
      for (int j = 0; j < words.length; j++) {
        if (j == 0) {
          System.out.print(words[j]);
          continue;
        }

        if (words[j].equals(words[j - 1])) continue;
        else System.out.print(words[j]);
      }

      System.out.println();
    }
  }
}
