import java.util.Scanner;

public class P14581 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    String name = scanner.nextLine();
    System.out.print(":fan::fan::fan:\n:fan::" + name + "::fan:\n:fan::fan::fan:");
  }
}
