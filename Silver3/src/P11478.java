import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P11478 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    Set<String> set = new HashSet<>();

    String word = scanner.nextLine();
    for (int i = 0; i < word.length(); i++) {
      for (int j = 0; j < word.length() - i; j++) {
        set.add(word.substring(j, j + i + 1));
      }
    }

    System.out.println(set.size());
  }
}
