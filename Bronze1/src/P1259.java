import java.util.Scanner;

public class P1259 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String line = scanner.nextLine();
      if (line.equals("0")) break;

      String reverseLine = new StringBuffer(line).reverse().toString();
      if (reverseLine.equals(line)) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
}
