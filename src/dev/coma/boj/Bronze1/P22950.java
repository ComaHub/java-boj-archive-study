package dev.coma.boj.Bronze1;

import java.util.Scanner;

public class P22950 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			@SuppressWarnings("unused")
			int myDigit = scanner.nextInt();
			scanner.nextLine();
			String inputBin = new StringBuffer(scanner.nextLine()).reverse().toString();
			int inputK = scanner.nextInt();

			if (!inputBin.contains("1")) {
			  System.out.println("YES");
			  return;
			}

			for (int i = 0; i < inputK; i++) {
			  if (inputBin.charAt(i) == '1') {
			    System.out.println("NO");
			    return;
			  }
			}
		}

    System.out.println("YES");
  }
}
