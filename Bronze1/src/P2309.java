import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class P2309 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int[] people = new int[9];
    for (int i = 0; i < people.length; i++) {
      people[i] = scanner.nextInt();
    }

    for (int i = 0; i < people.length; i++) {
      for (int j = (i + 1); j < people.length; j++) {
        int sum = 0;
        for (int k = 0; k < people.length; k++) {
          if (k != i && k != j) {
            sum += people[k];
          }
        }

        if (sum == 100) {
          ArrayList<Integer> arrayList = new ArrayList<>();

          for (int k = 0; k < people.length; k++) {
            if (k != i && k != j) {
              arrayList.add(people[k]);
            }
          }

          arrayList.sort(Comparator.naturalOrder());
          for (int l = 0; l < arrayList.size(); l++) {
            System.out.println(arrayList.get(l));
          }
          return;
        }
      }
    }
  }
}
