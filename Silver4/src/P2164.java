import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P2164 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = new LinkedList<>();

    int cardNum = scanner.nextInt();
    for (int i = 2; i <= cardNum; i += 2) {
      list.add(i);
    }
    if (cardNum % 2 == 1) list.add(0, cardNum);

    boolean cardSwitch = true;
    while (list.size() > 1) {
      if (cardSwitch) {
        list.remove(0);
        cardSwitch = false;
        continue;
      }

      int number = list.remove(0);
      list.add(number);
      cardSwitch = true;
    }

    System.out.println(list.get(0));
  }
}
