import java.util.Scanner;

public class P32775 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int timeOfRail = scanner.nextInt();
    int timeOfFlight = scanner.nextInt();

    System.out.println(timeOfFlight < timeOfRail ? "flight" : "high speed rail");
  }
}
