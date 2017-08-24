package com.colln;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_Colln_Ex {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(23457, "java");
		map.put(65432, "spring");
		map.put(23456, "scala");
		map.put(8764, "javascript");

		// System.out.println(map.containsKey(23457));
		// System.out.println(map.containsValue("scala"));

		Set<Map.Entry<Integer, String>> set = map.entrySet();

		for (Map.Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
