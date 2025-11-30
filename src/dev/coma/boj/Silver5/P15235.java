package dev.coma.boj.Silver5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class P15235 {
	
	private static class PizzaBoy {
		private int pizza;
		private int count;
		
		public int getPizza() {
			return pizza;
		}
		
		public void setPizza(int pizza) {
			this.pizza = pizza;
		}
		
		public int getCount() {
			return count;
		}
		
		public void setCount(int count) {
			this.count = count;
		}
		
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			List<PizzaBoy> boyList = new ArrayList<>();
			Queue<PizzaBoy> queue = new ArrayDeque<>();
			int people = scanner.nextInt();
			
			for (int i = 0; i < people; i++) {
				int maxPizza = scanner.nextInt();
				
				PizzaBoy boy = new PizzaBoy();
				boy.setPizza(maxPizza);
				
				boyList.add(boy);
				queue.offer(boy);
			}
			
			givePizza(queue);
			printCount(boyList);
		}
	}
	
	private static void givePizza(Queue<PizzaBoy> queue) {
		int giveCount = 0;
		
		while (!queue.isEmpty()) {
			giveCount++;
			
			PizzaBoy boy = queue.poll();
			if (boy.getPizza() == 1) {
				boy.setCount(giveCount);
			} else {
				boy.setPizza(boy.getPizza() - 1);
				queue.offer(boy);
			}
		}
	}
	
	private static void printCount(List<PizzaBoy> boyList) {
		for (PizzaBoy boy : boyList) {
			System.out.print(boy.getCount() + " ");
		}
	}
	
}
