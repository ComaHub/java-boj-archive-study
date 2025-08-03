import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class P2587 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> arrayList = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      arrayList.add(scanner.nextInt());
    }

    arrayList.sort(Comparator.naturalOrder());
    int middleNum = arrayList.get(2);

    int sum = 0;
    for (Integer i : arrayList) {
      sum += i;
    }
    int avg = sum / 5;

    System.out.println(avg);
    System.out.println(middleNum);
  }
}
