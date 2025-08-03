import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P9506 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();

    int num;
    while ((num = scanner.nextInt()) != -1) {
      list.clear();
      list.add(1);
      for (int i = 2; (i * i) <= num; i++) {
        if (num % i == 0) {
          list.add(i);
          list.add(num / i);
        }
      }

      int sum = 0;
      for (Integer i : list) {
        sum += i;
      }

      if (sum == num) {
        list.sort(Comparator.naturalOrder());

        System.out.print(num + " = ");
        for (int i = 0; i < list.size(); i++) {
          System.out.print(list.get(i));

          if (i != list.size() - 1) System.out.print(" + ");
        }

        System.out.println();
      } else System.out.println(num + " is NOT perfect.");
    }
  }
}
