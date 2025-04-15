import java.util.Scanner;

public class P1157 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] words = scanner.nextLine().toLowerCase().split("");
    int[] alphabet = new int[26];

    for (String word : words) {
      alphabet[(int) word.charAt(0) - 97]++;
    }

    int max = 0;
    int maxIndex = 0;
    for (int i = 0; i < alphabet.length; i++) {
      if (alphabet[i] > max) {
        max = alphabet[i];
        maxIndex = i;
      }
    }

    int count = 0;
    for (int i : alphabet) {
      if (i == max) count++;
    }

    if (count == 1) {
      int result = maxIndex + 65;
      System.out.println((char) result);
    } else {
      System.out.println("?");
    }
  }
}
