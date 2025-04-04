import java.util.Scanner;

public class P2675 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    for (int i = 0; i < testCase; i++) {
      int repeat = scanner.nextInt();
      String word = scanner.nextLine().substring(1);
      String[] words = new String[word.length()];

      for (int j = 0; j < word.length(); j++) {
        words[j] = String.valueOf(word.charAt(j));
      }

      for (String s : words) {
        System.out.print(s.repeat(repeat));
      }

      System.out.println();
    }
  }
}
