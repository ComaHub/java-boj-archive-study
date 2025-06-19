import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class P10815 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    Set<Integer> set = new HashSet<>();

    int myCard = Integer.parseInt(bufferedReader.readLine());
    String[] cardNumbers = bufferedReader.readLine().split(" ");
    for (int i = 0; i < myCard; i++) {
      set.add(Integer.valueOf(cardNumbers[i]));
    }

    int checkCard = Integer.parseInt(bufferedReader.readLine());
    String[] checkNumbers = bufferedReader.readLine().split(" ");
    for (int i = 0; i < checkCard; i++) {
      if (set.contains(Integer.valueOf(checkNumbers[i]))) bufferedWriter.write("1 ");
      else bufferedWriter.write("0 ");
    }

    bufferedWriter.flush();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
