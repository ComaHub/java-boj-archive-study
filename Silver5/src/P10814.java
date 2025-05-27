import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class P10814 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] members = new String[Integer.parseInt(bufferedReader.readLine())];
    for (int i = 0; i < members.length; i++) {
      members[i] = bufferedReader.readLine();
    }

    Arrays.sort(members, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        int num1 = Integer.parseInt(o1.split(" ")[0]);
        int num2 = Integer.parseInt(o2.split(" ")[0]);

        return Integer.compare(num1, num2);
      }
    });

    for (String member : members) {
      bufferedWriter.write(member + "\n");
    }

    bufferedWriter.flush();
    bufferedReader.close();
    bufferedWriter.close();
  }
}
