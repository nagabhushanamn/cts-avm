package com;

import java.util.Iterator;

class LinkedList<T> implements Iterable<T> {

	private class Node<T> {

		private T data;
		private Node<T> next;

		public Node(T data) {
			super();
			this.data = data;
		}

		public Node(T data, Node<T> next) {
			super();
			this.data = data;
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

	}

	Node<T> head = null;

	public void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> last = head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newNode);
		}
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

}

public class Ex_1 {

	public static void main(String[] args) {

		LinkedList<String> menu = new LinkedList<String>();
		menu.add("meals");
		menu.add("biryani");

		// -----------------------------------

		for (String item : menu) {
			System.out.println(item);
		}

	}

}
