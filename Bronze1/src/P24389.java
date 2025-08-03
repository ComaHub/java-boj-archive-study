import java.util.Arrays;
import java.util.Scanner;

public class P24389 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    int[] bits = new int[32];

    int inputNum = scanner.nextInt();
    int pointer = 0;
    while (inputNum > 0) {
      bits[pointer++] = inputNum % 2;
      inputNum /= 2;
    }

    reverseArr(bits);

    int[] newBits = Arrays.copyOf(bits, 32);
    getComplement(newBits);

    int result = compareArr(bits, newBits);
    System.out.println(result);
  }

  static void reverseArr(int[] arr) {
    int temp;

    for (int i = 0; i < arr.length / 2; i++) {
      temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }
  }

  static void getComplement(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) arr[i] = 0;
      else arr[i] = 1;
    }

    arr[arr.length - 1]++;

    for (int i = arr.length - 1; i > 0; i--) {
      if (arr[i] == 2) {
        arr[i] = 0;
        arr[i - 1]++;
      }
    }
  }

  static int compareArr(int[] arr1, int[] arr2) {
    int count = 0;

    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] != arr2[i]) count++;
    }

    return count;
  }
}
