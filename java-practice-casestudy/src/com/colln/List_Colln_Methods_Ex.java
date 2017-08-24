package com.colln;

import java.util.ArrayList;
import java.util.List;

public class List_Colln_Methods_Ex {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("B");
		list1.add("A");
		list1.add("C");
		
		List<String> subList1=list1.subList(0, 2);
		System.out.println(subList1);

	}

}
