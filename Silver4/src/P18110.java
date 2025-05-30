import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P18110 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> list = new ArrayList<>();

    int opinions = Integer.parseInt(bufferedReader.readLine());
    int cutLine = (int) Math.round((opinions / 100.0) * 15);

    for (int i = 0; i < opinions; i++) {
      list.add(Integer.parseInt(bufferedReader.readLine()));
    }

    Collections.sort(list);

    int sum = 0;
    for (int i = cutLine; i < opinions - cutLine; i++) {
      sum += list.get(i);
    }

    long avg = Math.round(((double) sum / (opinions - (2 * cutLine))));
    System.out.println(avg);
  }
}
