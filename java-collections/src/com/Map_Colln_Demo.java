package com;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_Colln_Demo {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<>();
		map.put("123456", "value1");
		map.put("456789", "value2");

		// System.out.println(map.get("123456"));

		// -------------------------------------

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + "\t" + map.get(key));
		}

	}

}
