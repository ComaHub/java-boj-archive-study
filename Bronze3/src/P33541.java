import java.util.Scanner;

public class P33541 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int inputYear = scanner.nextInt();

    for (int i = (inputYear + 1); i <= 9999; i++) {
      int specialNum = (i / 100) + (i % 100);

      if ((specialNum * specialNum) == i) {
        System.out.println(i);
        return;
      }
    }

    System.out.println(-1);
  }
}
