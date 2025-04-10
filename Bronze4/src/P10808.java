import java.util.Scanner;

public class P10808 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String word = scanner.nextLine();
    int[] alphabet = new int[26];
    for (int i = 0; i < word.length(); i++) {
      alphabet[word.charAt(i) - 97]++;
    }

    for (int i : alphabet) {
      System.out.print(i + " ");
    }
  }
}
