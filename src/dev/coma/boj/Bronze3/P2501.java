package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P2501 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int numN = scanner.nextInt();
			int numK = scanner.nextInt();

			int pointer = 1;
			int counter = 0;
			int result = 0;
			while (true) {
			  if (pointer > numN) {
			    System.out.println(0);
			    break;
			  }

			  if (numN % pointer == 0) {
			    result = pointer;
			    counter++;
			  }

			  if (counter == numK) {
			    System.out.println(result);
			    break;
			  }

			  pointer++;
			}
		}
  }
}
