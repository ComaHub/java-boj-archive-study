package dev.coma.boj.Silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class P26265 {
	private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) {
		try (BR; BW) {
			int testCase = Integer.parseInt(BR.readLine());
			String[][] mentoring = new String[testCase][2];
			for (int i = 0; i < mentoring.length; i++) {
				mentoring[i] = BR.readLine().split(" ");
			}
			
			Arrays.sort(mentoring, new Comparator<String[]>() {

				@Override
				public int compare(String[] o1, String[] o2) {
					if (o1[0].equals(o2[0])) {
						return o2[1].compareTo(o1[1]);
					} else {
						return o1[0].compareTo(o2[0]);
					}
				}

			});
			
			for (String[] mentorArr : mentoring) {
				BW.write(String.join(" ", mentorArr) + "\n");
			}
			
			BW.flush();
			
		} catch (Exception e) { e.printStackTrace(); }
	}
}
