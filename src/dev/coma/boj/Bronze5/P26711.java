package dev.coma.boj.Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class P26711 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			BigInteger numA = new BigInteger(scanner.nextLine());
			BigInteger numB = new BigInteger(scanner.nextLine());
			
			System.out.println(numA.add(numB));
		}
	}
}
