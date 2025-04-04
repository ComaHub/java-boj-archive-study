import java.util.Scanner;

public class P20254 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int UR_SCORE = 56;
    int TR_SCORE = 24;
    int UO_SCORE = 14;
    int TO_SCORE = 6;

    int ur = scanner.nextInt();
    int tr = scanner.nextInt();
    int uo = scanner.nextInt();
    int to = scanner.nextInt();

    int siteScore = (UR_SCORE * ur) + (TR_SCORE * tr) + (UO_SCORE * uo) + (TO_SCORE * to);
    System.out.println(siteScore);
  }
}
