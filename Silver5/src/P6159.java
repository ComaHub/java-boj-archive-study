import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P6159 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String[] setting = bufferedReader.readLine().split(" ");
    int cowNum = Integer.parseInt(setting[0]);
    int costumeLength = Integer.parseInt(setting[1]);

    int[] cows = new int[cowNum];
    for (int i = 0; i < cows.length; i++) {
      cows[i] = Integer.parseInt(bufferedReader.readLine());
    }

    Arrays.sort(cows);
    int count = 0;
    for (int i = 0; i < cows.length - 1; i++) {
      if (cows[i] >= costumeLength) break;

      for (int j = i + 1; j < cows.length; j++) {
        if (cows[i] + cows[j] > costumeLength) break;

        count++;
      }
    }

    System.out.println(count);
  }
}
