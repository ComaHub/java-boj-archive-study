import java.util.Scanner;

public class P11721 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    String word = scanner.nextLine();
    for (int i = 0; (i * 10) < word.length(); i++) {
      System.out.println(word.substring((i * 10), Math.min((i * 10) + 10, word.length())));
    }
  }
}
