package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P28235 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String cheer = scanner.nextLine();

			switch (cheer) {
			  case "SONGDO":
			    System.out.println("HIGHSCHOOL");
			    break;

			  case "CODE":
			    System.out.println("MASTER");
			    break;

			  case "2023":
			    System.out.println("0611");
			    break;

			  case "ALGORITHM":
			    System.out.println("CONTEST");
			    break;

			  default:
			    System.out.println("...");
			}
		}
  }
}
