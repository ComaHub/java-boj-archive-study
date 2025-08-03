import java.util.ArrayList;
import java.util.Scanner;

public class P28431 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> arrayList = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      Integer number = scanner.nextInt();

      if (arrayList.contains(number)) {
        arrayList.remove(number);
      } else {
        arrayList.add(number);
      }
    }

    System.out.println(arrayList.get(0));
  }
}
