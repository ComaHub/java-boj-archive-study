package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P6763 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int limit = scanner.nextInt();
			int mySpeed = scanner.nextInt();

			int overSpeed = mySpeed - limit;

			if (overSpeed <= 0) {
			  System.out.println("Congratulations, you are within the speed limit!");
			} else if (overSpeed <= 20) {
			  System.out.println("You are speeding and your fine is $100.");
			} else if (overSpeed <= 30) {
			  System.out.println("You are speeding and your fine is $270.");
			} else {
			  System.out.println("You are speeding and your fine is $500.");
			}
		}
  }
}
