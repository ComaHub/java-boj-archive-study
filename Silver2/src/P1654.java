import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1654 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> list = new ArrayList<>();

    String[] input = bufferedReader.readLine().split(" ");
    int numMyLan = Integer.parseInt(input[0]);
    int needLan = Integer.parseInt(input[1]);

    for (int i = 0; i < numMyLan; i++) {
      list.add(Integer.parseInt(bufferedReader.readLine()));
    }

    list.sort(Collections.reverseOrder());

    int startLength = 1;
    int endLength = list.get(0);
    int midLength;
    boolean overFlag;

    do {
      midLength = (startLength + endLength) / 2;

      int count = 0;
      for (Integer i : list) {
        count += (i / midLength);

        if (count >= needLan) break;
      }

      if (count >= needLan) {
        overFlag = true;
        startLength = midLength + 1;
      } else {
        overFlag = false;
        endLength = midLength - 1;
      }
    } while (startLength <= endLength);

    if (!overFlag) {
      while (true) {
        int count = 0;

        for (Integer i : list) {
          count += (i / midLength);
        }

        if (count >= needLan) break;
        midLength--;
      }

      System.out.println(midLength);
    }

    if (overFlag) {
      while (true) {
        int count = 0;

        for (Integer i : list) {
          count += (i / midLength);
        }

        if (count < needLan) break;
        midLength++;
      }

      System.out.println(--midLength);
    }
  }
}
