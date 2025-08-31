package dev.coma.Bronze4;

import java.util.Scanner;

public class P5532 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int vacation = scanner.nextInt();
			int totalLang = scanner.nextInt();
			int totalMath = scanner.nextInt();
			int myLang = scanner.nextInt();
			int myMath = scanner.nextInt();

			int dayLang = 0;
			if (totalLang % myLang == 0) {
			  dayLang = totalLang / myLang;
			} else {
			  dayLang = (totalLang / myLang) + 1;
			}

			int dayMath = 0;
			if (totalMath % myMath == 0) {
			  dayMath = totalMath / myMath;
			} else {
			  dayMath = (totalMath / myMath) + 1;
			}

			System.out.println(vacation - (Math.max(dayLang, dayMath)));
		}
  }
}
