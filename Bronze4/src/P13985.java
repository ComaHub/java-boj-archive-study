import java.util.Scanner;

public class P13985 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    String[] line = scanner.nextLine().split(" ");
    int sumAB = (Integer.parseInt(line[0]) + Integer.parseInt(line[2]));
    int sumC = Integer.parseInt(line[4]);

    System.out.println(sumAB == sumC ? "YES" : "NO");
  }
}
