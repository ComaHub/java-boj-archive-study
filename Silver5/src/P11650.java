import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class P11650 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] points = new String[Integer.parseInt(bufferedReader.readLine())];
    for (int i = 0; i < points.length; i++) {
      points[i] = bufferedReader.readLine();
    }

    Arrays.sort(points, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        int x1 = Integer.parseInt(o1.split(" ")[0]);
        int x2 = Integer.parseInt(o2.split(" ")[0]);

        int y1 = Integer.parseInt(o1.split(" ")[1]);
        int y2 = Integer.parseInt(o2.split(" ")[1]);

        if (x1 == x2) {
          return Integer.compare(y1, y2);
        } else {
          return Integer.compare(x1, x2);
        }
      }
    });

    for (String point : points) {
      bufferedWriter.write(point + "\n");
    }

    bufferedWriter.flush();
    bufferedReader.close();
    bufferedWriter.close();
  }
}
