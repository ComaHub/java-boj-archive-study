import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P25756 {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    try (br; bw) {
      int potionCount = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());

      double myPiercing = 0.0;
      for (int i = 0; i < potionCount; i++) {
        double potionPiercing = Double.parseDouble(st.nextToken()) * 0.01;

        myPiercing = 1 - (1 - myPiercing) * (1 - potionPiercing);
        bw.write((myPiercing * 100) + "\n");
      }

      bw.flush();
    } catch (Exception e) { e.printStackTrace(); }
  }
}
