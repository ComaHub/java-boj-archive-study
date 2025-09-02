package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P14652 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			@SuppressWarnings("unused")
			int row = scanner.nextInt();
			int col = scanner.nextInt();
			int seatNo = scanner.nextInt();

			System.out.println((seatNo / col) + " " + (seatNo % col));
		}
  }
}
