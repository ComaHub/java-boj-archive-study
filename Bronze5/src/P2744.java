import java.util.Scanner;

public class P2744 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String word = scanner.nextLine();
    String[] newWord = new String[word.length()];

    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      String s = c + "";

      if (c < 95) {
        newWord[i] = s.toLowerCase();
      } else {
        newWord[i] = s.toUpperCase();
      }
    }

    for (String s : newWord) {
      System.out.print(s);
    }
  }
}
