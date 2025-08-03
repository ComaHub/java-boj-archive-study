import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P17202 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    List<Integer> backupList;

    String[] myNum = scanner.nextLine().split("");
    String[] yourNum = scanner.nextLine().split("");

    for (int i = 0; i < myNum.length; i++) {
      list.add(Integer.parseInt(myNum[i]));
      list.add(Integer.parseInt(yourNum[i]));
    }

    while (list.size() > 2) {
      backupList = list;
      list = new ArrayList<>();

      for (int i = 0; i < backupList.size() - 1; i++) {
        list.add((backupList.get(i) + backupList.get(i + 1)) % 10);
      }
    }

    for (Integer i : list) {
      System.out.print(i);
    }
  }
}
