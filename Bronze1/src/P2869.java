import java.util.Scanner;

public class P2869 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int up = scanner.nextInt();
    int down = scanner.nextInt();
    int goal = scanner.nextInt();

    int dailyMove = up - down;
    int date = ((goal - up) / dailyMove);
    if ((goal - up) % dailyMove == 0) {
      date++;
    } else {
      date += 2;
    }

    System.out.println(date);
  }
}
