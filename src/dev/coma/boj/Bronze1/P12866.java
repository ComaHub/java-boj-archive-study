package dev.coma.boj.Bronze1;

import java.util.Scanner;

public class P12866 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			scanner.nextLine();
			String[] words = scanner.nextLine().split("");

			long numA = 0;
			long numC = 0;
			long numG = 0;
			long numT = 0;
			for (int i = 0; i < words.length; i++) {
			  switch (words[i]) {
			    case "A" -> numA++;
			    case "C" -> numC++;
			    case "G" -> numG++;
			    case "T" -> numT++;
			    default -> {}
			  }
			}

			long result = (numA * numC) % 1000000007;
			result *= numG;
			result %= 1000000007;
			result *= numT;
			result %= 1000000007;

			System.out.println(result);
		}
  }
}
