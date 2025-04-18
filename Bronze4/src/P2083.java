import java.util.Scanner;

public class P2083 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String[] profile = scanner.nextLine().split(" ");
      if (profile[0].equals("#")) break;

      if (Integer.parseInt(profile[1]) > 17 || Integer.parseInt(profile[2]) >= 80) {
        System.out.println(profile[0] + " Senior");
      } else {
        System.out.println(profile[0] + " Junior");
      }
    }
  }
}
