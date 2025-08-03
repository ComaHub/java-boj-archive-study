import java.util.Scanner;

public class P17548 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    String hey = scanner.nextLine();
    String e = hey.substring(1, hey.length() - 1);
    System.out.println("h" + e.repeat(2) + "y");
  }
}
