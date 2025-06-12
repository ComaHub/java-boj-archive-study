import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class P17219 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    Map<String, String> map = new HashMap<>();

    String[] settings = bufferedReader.readLine().split(" ");
    int savedSiteNum = Integer.parseInt(settings[0]);
    int findSiteNum = Integer.parseInt(settings[1]);

    for (int i = 0; i < savedSiteNum; i++) {
      settings = bufferedReader.readLine().split(" ");
      map.put(settings[0], settings[1]);
    }

    for (int i = 0; i < findSiteNum; i++) {
      String key = bufferedReader.readLine();
      bufferedWriter.write(map.get(key) + "\n");
    }

    bufferedWriter.flush();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
