import java.util.Scanner;

public class P2845 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int people = scanner.nextInt();
    int area = scanner.nextInt();
    int totalPeople= people * area;

    int[] newsPeople = new int[5];
    for (int i = 0; i < newsPeople.length; i++) {
      newsPeople[i] = scanner.nextInt();
    }

    for (int p : newsPeople) {
      System.out.print((p - totalPeople) + " ");
    }
  }
}
