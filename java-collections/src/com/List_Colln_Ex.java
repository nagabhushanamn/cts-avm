package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class List_Colln_Ex {

	public static void main(String[] args) {

		// ArrayList<String> list = new ArrayList<>();
		// list.add("B");
		// list.add("C");
		// list.add("D");
		// list.add("A");
		// list.add("B");
		//
		// System.out.println(list);

		// --------------------------------------------
		//
		// List<String> list = new ArrayList<>();
		// list=new LinkedList<>();

		// ----------------------------------------------
		//
		// Collection<String> collection=new ArrayList<>();
		// collection=new TreeSet<>();

		// -------------------------------------------------

		// List Colln Methods

		// List<String> list = new ArrayList<>();
		//
		// list.add("A"); // append
		// list.add(1, "B"); // insert by index
		//
		// // System.out.println(list.get(0));
		//
		// list.set(0, "a");
		// list.remove(1);
		//
		// System.out.println(list);

		// -------------------------------------------------

		// List<String> list = new ArrayList<>();
		//
		// // System.out.println(list.isEmpty());
		// // System.out.println(list.size());
		// list.add("A");
		// // System.out.println(list.contains("A"));
		//
		// List<String> list2 = new ArrayList<>();
		// list2.addAll(list);
		// list2.add("B");
		//
		// System.out.println(list2);

		// -------------------------------------------------

		// List<String> list = new ArrayList<>();
		// list.add("A");
		// list.add("C");
		// list.add("B");
		// list.add("D");
		//
		// List<String> list2 = new ArrayList<>();
		// list2.add("A");
		// list2.add("X");
		// list2.add("Y");
		// list2.add("B");
		//
		// // list.clear();
		//
		// // list.removeAll(list2);
		// list.retainAll(list2);
		//
		// System.out.println(list);

		// -----------------------------------------------

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("D");

		// How to iterate list/set colln ?

		// 3 ways

		// way-1 : Iterator ( uni directional )

		// Iterator<String> it=list.iterator();
		// while(it.hasNext()) {
		// System.out.println(it.next());
		// }

		// way-2 : ListIterator ( Bi-directional )

		// ListIterator<String> listIt = list.listIterator();
		// while (listIt.hasNext()) {
		// System.out.println(listIt.next());
		// }
		// System.out.println();
		// while (listIt.hasPrevious()) {
		// System.out.println(listIt.previous());
		// }

		// way-3 : using for-each loop ( from JDK 1.5 )

		for (String item : list) {
			System.out.println(item);
		}

	}

}
