package dev.coma.boj.Silver2;

import java.util.Scanner;

public class P10799 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String[] line = scanner.nextLine().split("");
			int count = 0;
			int tree = 0;
			for (int i = 0; i < line.length; i++) {
			  switch (line[i]) {
			    case "(" -> tree++;

			    case ")" -> {
			      if (i == 0) continue;

			      switch (line[i - 1]) {
			        case "(" -> count += --tree;
			        case ")" -> {
			          tree--;
			          count++;
			        }
			      }
			    }
			  }
			}

			System.out.println(count);
		}
  }
}
