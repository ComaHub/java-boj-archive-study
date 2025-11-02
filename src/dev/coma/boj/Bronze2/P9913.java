package dev.coma.boj.Bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P9913 {
	private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) {
		try (BR; BW) {
			int testCase = Integer.parseInt(BR.readLine());
			int[] numbers = new int[testCase];
			
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = Integer.parseInt(BR.readLine());
			}
			
			Arrays.sort(numbers);
			
			int count = 1;
			int maxCount = 1;
			for (int i = 1; i < numbers.length; i++) {
				if (numbers[i - 1] == numbers[i]) {
					count++;
					maxCount = count > maxCount ? count : maxCount;
				} else {
					count = 1;
				}
			}
			
			System.out.println(maxCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
