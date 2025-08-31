package dev.coma.Bronze4;

import java.util.Scanner;

public class P21612 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int boilPoint = scanner.nextInt();

			int airPressure = (5 * boilPoint) - 400;

			int myPosition;
			if (boilPoint > 100) {
			  myPosition = -1;
			} else if (boilPoint < 100) {
			  myPosition = 1;
			} else {
			  myPosition = 0;
			}

			System.out.println(airPressure);
			System.out.println(myPosition);
		}
  }
}
