import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class P10817 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> arrayList = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      arrayList.add(scanner.nextInt());
    }

    arrayList.sort(Comparator.naturalOrder());
    System.out.println(arrayList.get(1));
  }
}
