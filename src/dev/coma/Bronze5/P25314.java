package dev.coma.Bronze5;

import java.util.Scanner;

public class P25314 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int byteNum = scanner.nextInt() / 4;
			for (int i = 0; i < byteNum; i++) {
			  System.out.print("long ");
			}
		}

    System.out.println("int");
  }
}
