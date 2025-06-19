import java.io.*;
import java.util.*;

public class P18870 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    Set<Integer> set = new HashSet<>();
    List<Integer> list;
    Map<Integer, Integer> map = new HashMap<>();

    int num = Integer.parseInt(bufferedReader.readLine());
    String[] numbers = bufferedReader.readLine().split(" ");
    for (int i = 0; i < num; i++) {
      set.add(Integer.valueOf(numbers[i]));
    }

    list = new ArrayList<>(set);
    list.sort(Comparator.naturalOrder());
    for (int i = 0; i < list.size(); i++) {
      map.put(list.get(i), i);
    }

    for (String number : numbers) {
      bufferedWriter.write(map.get(Integer.valueOf(number)) + " ");
    }

    bufferedWriter.flush();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
