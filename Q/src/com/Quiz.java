package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Quiz {

	public static void main(String[] args) throws IOException {

		File file = new File("records.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		Map<String, Double> report = new TreeMap<>();

		String record = null;
		while ((record = br.readLine()) != null) {
			String[] tokens = record.split(",");
			String dep = tokens[2];
			String salary = tokens[3];
			if (report.containsKey(dep)) {
				double total = report.get(dep);
				report.put(dep, total + Double.parseDouble(salary));
			} else {
				report.put(dep, Double.parseDouble(salary));
			}
		}

		System.out.println(report);

		br.close();
		fr.close();

	}

}
