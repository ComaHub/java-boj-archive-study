import java.util.Scanner;

public class P1264 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String sentence = scanner.nextLine();
      if (sentence.equals("#")) break;

      String[] alphabet = sentence.split("");
      int count = 0;
      for (String s : alphabet) {
        if ("AEIOUaeiou".contains(s)) count++;
      }

      System.out.println(count);
    }
  }
}
