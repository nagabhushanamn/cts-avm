package com.colln;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListCompare {
	public void compare(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add("data-" + i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}

public class List_Colln_Ex {

	public static void main(String[] args) {

		ListCompare listCompare = new ListCompare();
		listCompare.compare(new ArrayList<>(10000));
		listCompare.compare(new LinkedList<>());

	}

}
