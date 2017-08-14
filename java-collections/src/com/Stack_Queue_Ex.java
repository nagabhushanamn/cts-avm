package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue_Ex {

	public static void main(String[] args) {
		//
		// Stack<String> stack = new Stack<>();
		// stack.add("A");
		// stack.push("B");
		// stack.push("C");
		//
		// System.out.println(stack.peek());
		// System.out.println(stack.pop());
		// System.out.println(stack);

		// while(!stack.isEmpty()) {
		// System.out.println(stack.pop());
		// }

		// --------------------------------------

		// Queue<String> queue = new LinkedList<>();
		// queue.add("A");
		// queue.add("C");
		// queue.add("B");
		//
		// // System.out.println(queue.peek());
		//
		// while (!queue.isEmpty()) {
		// System.out.println(queue.poll());
		// }

		// ----------------------------------------

		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("A");
		queue.add("C");
		queue.add("B");

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
