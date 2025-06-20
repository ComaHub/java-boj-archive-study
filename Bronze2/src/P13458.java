import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P13458 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int testRoom = Integer.parseInt(bufferedReader.readLine());
    int[] rooms = new int[testRoom];
    String[] people = bufferedReader.readLine().split(" ");
    for (int i = 0; i < rooms.length; i++) {
      rooms[i] = Integer.parseInt(people[i]);
    }

    String[] settings = bufferedReader.readLine().split(" ");
    int masterMind = Integer.parseInt(settings[0]);
    int subMind = Integer.parseInt(settings[1]);

    long count = 0;
    for (int i = 0; i < rooms.length; i++) {
      int ppl = rooms[i];
      ppl -= masterMind;
      count++;

      if (ppl > 0) count += (ppl % subMind == 0) ? (ppl / subMind) : (ppl / subMind) + 1;
    }

    System.out.println(count);
  }
}
