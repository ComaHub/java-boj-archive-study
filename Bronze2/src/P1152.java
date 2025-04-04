import java.util.Scanner;

public class P1152 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String line = scanner.nextLine().strip();
    if (!line.isEmpty()) {
      String[] words = line.split(" ");
      System.out.println(words.length);
    } else {
      System.out.println(0);
    }
  }
}
