import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4673 {
  public static void main(String[] args) {
    Integer[] arr = {1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97};
    List<Integer> list = new ArrayList<>(Arrays.asList(arr));

    for (int i = 100; i <= 10000; i++) {
      int startNum = i - (String.valueOf(i).length() * 9);
      boolean isExist = false;

      for (int j = startNum; j <= i; j++) {
        int num = j;
        int adder = j;

        while(adder > 0) {
          num += adder % 10;
          adder /= 10;
        }

        if (num == i) {
          isExist = true;
          break;
        }
      }

      if (!isExist) list.add(i);
    }

    for (Integer i : list) {
      System.out.println(i);
    }
  }
}
