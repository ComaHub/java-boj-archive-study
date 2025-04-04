import java.util.Scanner;

public class P2920 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    StringBuffer rhythm = new StringBuffer("");
    for (int i = 0; i < 8; i++) {
      rhythm.append(scanner.nextInt());
    }
    String rhythmString = rhythm.toString();

    if (rhythmString.equals("12345678")) {
      System.out.println("ascending");
    } else if (rhythmString.equals("87654321")) {
      System.out.println("descending");
    } else {
      System.out.println("mixed");
    }
  }
}
