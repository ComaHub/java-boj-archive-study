package dev.coma.Bronze2;

import java.util.Scanner;

public class P1919 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String[] word1 = scanner.nextLine().split("");
			String[] word2 = scanner.nextLine().split("");

			for (int i = 0; i < word1.length; i++) {
			  for (int j = 0; j < word2.length; j++) {
			    if (word1[i].equals(word2[j])) {
			      word1[i] = "0";
			      word2[j] = "0";
			      break;
			    }
			  }
			}

			int count = 0;
			for (String s : word1) {
			  if (!s.equals("0")) count++;
			}

			for (String s : word2) {
			  if (!s.equals("0")) count++;
			}

			System.out.println(count);
		}
  }
}
