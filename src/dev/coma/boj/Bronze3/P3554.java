package dev.coma.boj.Bronze3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P3554 {
	private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) {
		try (BR; BW) {
			int inputLength = Integer.parseInt(BR.readLine());
			String[] input = BR.readLine().split(" ");
			
			int[] inputNumbers = new int[inputLength];
			for (int i = 0; i < input.length; i++) {
				inputNumbers[i] = Integer.parseInt(input[i]);
			}
			
			int commands = Integer.parseInt(BR.readLine());
			for (int i = 0; i < commands; i++) {
				String[] inputCommand = BR.readLine().split(" ");
				
				if ("1".equals(inputCommand[0])) job1(inputNumbers, Integer.parseInt(inputCommand[1]) - 1, Integer.parseInt(inputCommand[2]) - 1);
				else job2(inputNumbers, Integer.parseInt(inputCommand[1]) - 1, Integer.parseInt(inputCommand[2]) - 1);
			}
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	private static void job1 (int[] inputNumbers, int start, int end) {
		for (int i = start; i <= end; i++) {
			inputNumbers[i] = ((int) Math.pow(inputNumbers[i], 2)) % 2010;
		}
	}
	
	private static void job2 (int[] inputNumbers, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += inputNumbers[i];
		}
		
		System.out.println(sum);
	}
}
