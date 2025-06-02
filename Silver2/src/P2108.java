import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2108 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    List<String> list = new ArrayList<>();

    int number = Integer.parseInt(bufferedReader.readLine());
    int[] numbers = new int[number];

    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(bufferedReader.readLine());
      sum += numbers[i];
    }

    Arrays.sort(numbers);

    System.out.println((int) Math.round((double) sum / numbers.length));
    System.out.println(numbers[(numbers.length - 1) / 2]);

    int count = 0;
    if (numbers.length > 1) {
      for (int i = 0; i < numbers.length - 1; i++) {
        count++;
        if (numbers[i] == numbers[i + 1]) continue;

        list.add(numbers[i] + " " + count);
        count = 0;
      }
    }

    count++;
    list.add(numbers[numbers.length - 1] + " " + count);

    if (numbers.length > 1) {
      Collections.sort(list, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
          if (Integer.parseInt(o2.split(" ")[1]) == Integer.parseInt(o1.split(" ")[1])) {
            return Integer.parseInt(o1.split(" ")[0]) - Integer.parseInt(o2.split(" ")[0]);
          } else {
            return Integer.parseInt(o2.split(" ")[1]) - Integer.parseInt(o1.split(" ")[1]);
          }
        }
      });

      if (list.get(0).split(" ")[1].equals(list.get(1).split(" ")[1])) {
        System.out.println(list.get(1).split(" ")[0]);
      } else {
        System.out.println(list.get(0).split(" ")[0]);
      }
    } else {
      System.out.println(list.get(0).split(" ")[0]);
    }

    System.out.println(numbers[numbers.length - 1] - numbers[0]);
  }
}
