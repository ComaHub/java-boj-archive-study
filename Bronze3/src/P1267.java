import java.util.Scanner;

public class P1267 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int calls = scanner.nextInt();
    int youngSik = 0;
    int minSik = 0;
    for (int i = 0; i < calls; i++) {
      int call = scanner.nextInt();

      youngSik += ((call / 30) + 1) * 10;
      minSik += ((call / 60) + 1) * 15;
    }

    if (youngSik > minSik) {
      System.out.println("M " + minSik);
    } else if (youngSik < minSik) {
      System.out.println("Y " + youngSik);
    } else {
      System.out.println("Y M " + youngSik);
    }
  }
}
