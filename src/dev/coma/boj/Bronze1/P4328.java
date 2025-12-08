package dev.coma.boj.Bronze1;

import java.math.BigInteger;
import java.util.Scanner;

public class P4328 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        String input = scanner.nextLine();
        if ("0".equals(input)) break;

        String[] inputs = input.split(" ");
        int scale = Integer.parseInt(inputs[0]);
        BigInteger numA = new BigInteger(inputs[1], scale);
        BigInteger numB = new BigInteger(inputs[2], scale);

        System.out.println(numA.remainder(numB).toString(scale));
      }
    }
  }
}
