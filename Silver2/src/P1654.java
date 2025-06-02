import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1654 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String[] input = bufferedReader.readLine().split(" ");
    int numMyLan = Integer.parseInt(input[0]);
    int needLan = Integer.parseInt(input[1]);
    int[] numbers = new int[numMyLan];

    long sum = 0;
    for (int i = 0; i < numMyLan; i++) {
      numbers[i] = Integer.parseInt(bufferedReader.readLine());
      sum += numbers[i];
    }

    bufferedReader.close();

    Arrays.sort(numbers);

    long startLength = 1;
    long endLength = (int) ((double) sum / numMyLan);
    long midLength;
    boolean overFlag;

    do {
      midLength = (startLength + endLength) / 2;

      long count = 0;
      for (int i : numbers) {
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
        long count = 0;

        for (int i : numbers) {
          count += (i / midLength);
        }

        if (count >= needLan) break;
        midLength--;
      }

      System.out.println(midLength);
    }

    if (overFlag) {
      while (true) {
        long count = 0;

        for (int i : numbers) {
          count += (i / midLength);
        }

        if (count < needLan) break;
        midLength++;
      }

      System.out.println(--midLength);
    }
  }
}
