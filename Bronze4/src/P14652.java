import java.util.Scanner;

public class P14652 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int row = scanner.nextInt();
    int col = scanner.nextInt();
    int seatNo = scanner.nextInt();

    System.out.println((seatNo / col) + " " + (seatNo % col));
  }
}
