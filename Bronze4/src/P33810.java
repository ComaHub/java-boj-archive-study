import java.util.Scanner;

public class P33810 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    String myWord = "SciComLove";
    String yourWord = scanner.nextLine();

    int count = 0;
    for (int i = 0; i < myWord.length(); i++) {
      char myChar = myWord.charAt(i);
      char yourChar = yourWord.charAt(i);

      if (myChar != yourChar) count++;
    }

    System.out.println(count);
  }
}
