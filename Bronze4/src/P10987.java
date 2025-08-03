import java.util.Scanner;

public class P10987 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    String[] words = scanner.nextLine().split("");

    int count = 0;
    for (String word : words) {
      if ("aeiou".contains(word)) {
        count++;
      }
    }

    System.out.println(count);
  }
}
