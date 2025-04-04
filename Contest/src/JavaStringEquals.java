import java.util.Scanner;

public class JavaStringEquals {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String a = setString(scanner);
    String b = setString(scanner);

    isEqual(a, b);
    isEqualIgnoreCase(a, b);
  }

  public static String setString(Scanner scanner) {
    String line = scanner.nextLine();
    if (line.equals("null")) {
      line = null;
    }

    return line;
  }

  public static void isEqual(String a, String b) {
    if (a == null) {
      System.out.println("NullPointerException");
      return;
    }

    System.out.println(a.equals(b));
  }

  public static void isEqualIgnoreCase(String a, String b) {
    if (a == null) {
      System.out.println("NullPointerException");
      return;
    }

    System.out.println(a.equalsIgnoreCase(b));
  }
}
