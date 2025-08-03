import java.util.Scanner;

public class P11365 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String sentence = scanner.nextLine();
      if (sentence.equals("END")) break;

      String result = new StringBuffer(sentence).reverse().toString();
      System.out.println(result);
    }
  }
}
