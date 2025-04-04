import java.util.Scanner;

public class P3028 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] cups = {"O", "X", "X"};
    String shake = scanner.nextLine();
    String temp;

    for (int i = 0; i < shake.length(); i++) {
      String thisTurn = Character.toString(shake.charAt(i));

      switch (thisTurn) {
        case "A":
          temp = cups[1];
          cups[1] = cups[0];
          cups[0] = temp;
          break;

        case "B":
          temp = cups[2];
          cups[2] = cups[1];
          cups[1] = temp;
          break;

        case "C":
          temp = cups[2];
          cups[2] = cups[0];
          cups[0] = temp;
          break;

        default:
          System.out.println("잘못된 방법입니다.");
          return;
      }
    }

    for (int i = 0; i < cups.length; i++) {
      if (cups[i].equals("O")) {
        System.out.println(i + 1);
      }
    }
  }
}
