import java.io.*;
import java.util.Arrays;

public class P10989 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int testCase = Integer.parseInt(bufferedReader.readLine());
    int[] numbers = new int[testCase];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(bufferedReader.readLine());
    }

    Arrays.sort(numbers);

    for (int number : numbers) {
      bufferedWriter.write(number + "\n");
    }

    bufferedWriter.flush();
    bufferedReader.close();
    bufferedWriter.close();
  }
}
