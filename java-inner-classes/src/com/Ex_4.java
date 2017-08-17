package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 *  when we need anonymous inner-class ?
 *  
 *  when we need any class by extending/implementing, with single object
 *  in any function.
 * 
 */

interface Work {
	void doWork();
}

class WorkImpl implements Work {
	@Override
	public void doWork() {
		System.out.println("work impln1");
	}
}

public class Ex_4 {

	public static void main(String[] args) {

		Work work = new WorkImpl();

		// --------------------------

		Work work2 = new Work() {
			@Override
			public void doWork() {
				System.out.println("work impln2");
			}
		};

		// work2.doWork();

		List<String> list = new ArrayList<>();
		list.add("B");
		list.add("A");
		list.add("C");

		// --------------------------

		// Collections.sort(list, new Desc());

		Collections.sort(list, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});

		Collections.sort(list, (o1, o2) -> o2.compareTo(o1)); // java8 ==> lambdas

		System.out.println(list);

	}

}
//
// class Desc implements Comparator<String> {
// @Override
// public int compare(String o1, String o2) {
// return o2.compareTo(o1);
// }
// }
