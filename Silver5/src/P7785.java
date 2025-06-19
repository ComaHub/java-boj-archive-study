import java.io.*;
import java.util.*;

public class P7785 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    Set<String> members = new HashSet<>();
    List<String> result;

    int logs = Integer.parseInt(bufferedReader.readLine());
    for (int i = 0; i < logs; i++) {
      String[] log = bufferedReader.readLine().split(" ");

      switch (log[1]) {
        case "enter" -> members.add(log[0]);
        case "leave" -> members.remove(log[0]);
      }
    }

    result = new ArrayList<>(members);
    result.sort(Comparator.reverseOrder());
    for (String s : result) {
      bufferedWriter.write(s + "\n");
    }

    bufferedWriter.flush();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
