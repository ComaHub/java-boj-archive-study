import java.util.Scanner;

public class P32902 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int canNum = scanner.nextInt();
    int chipNum = scanner.nextInt();

    System.out.println((chipNum + 1) + " " + ((chipNum * canNum) + 1));
  }
}
