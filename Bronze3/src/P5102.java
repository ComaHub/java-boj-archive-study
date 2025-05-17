import java.util.Scanner;

public class P5102 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      int ownToys = scanner.nextInt();
      int nightToys = scanner.nextInt();

      if (ownToys == 0 && nightToys == 0) break;

      int toys = ownToys - nightToys;

      if (toys % 2 == 0) {
        System.out.println((toys / 2) + " " + 0);
      } else if (toys >= 3) {
        System.out.println(((toys / 2) - 1) + " " + 1);
      } else {
        System.out.println(0 + " " + 0);
      }
    }
  }
}
