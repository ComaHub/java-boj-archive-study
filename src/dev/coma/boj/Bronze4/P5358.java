package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P5358 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNext()) {
			  String[] input = scanner.nextLine().split("");

			  for (int i = 0; i < input.length; i++) {
			    if ("e".equals(input[i])) {
			      input[i] = "i";
			    } else if ("i".equals(input[i])) {
			      input[i] = "e";
			    } else if ("E".equals(input[i])) {
			      input[i] = "I";
			    } else if ("I".equals(input[i])) {
			      input[i] = "E";
			    }
			  }

			  System.out.println(String.join("", input));
			}
		}
  }
}
