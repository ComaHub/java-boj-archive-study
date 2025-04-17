import java.util.ArrayList;
import java.util.Scanner;

public class P10870 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> arrayList = new ArrayList<>();

    int num = scanner.nextInt();

    arrayList.add(0);
    arrayList.add(1);

    int pointer = 0;
    if (num > 0) {
      pointer++;
    }

    while (pointer < num) {
      pointer++;
      arrayList.add(arrayList.get(pointer - 2) + arrayList.get(pointer - 1));
    }

    System.out.println(arrayList.get(pointer));
  }
}
