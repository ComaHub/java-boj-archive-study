import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1929 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();

    int startNum = scanner.nextInt();
    int endNum = scanner.nextInt();

    if (startNum == 1) startNum++;

    Master:
    for (int i = startNum; i <= endNum; i++) {
      for (int j = 2; (j * j) <= i; j++) {
        if (i % j == 0) continue Master;
      }

      list.add(i);
    }

    for (Integer i : list) {
      System.out.println(i);
    }
  }
}
