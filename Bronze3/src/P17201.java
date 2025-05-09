import java.util.Scanner;

public class P17201 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int amountMagnet = scanner.nextInt();
    scanner.nextLine();

    String magnetCol = scanner.nextLine();

    if (magnetCol.contains("11") || magnetCol.contains("22")) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
