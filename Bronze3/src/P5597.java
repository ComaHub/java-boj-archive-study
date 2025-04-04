import java.util.Scanner;

public class P5597 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] students = new String[30];
    for (int i = 0; i < 28; i++) {
      int n = scanner.nextInt();
      students[n - 1] = "O";
    }

    for (int i = 0; i < 30; i++) {
      if (students[i] == null) {
        System.out.println(i + 1);
      }
    }
  }
}
