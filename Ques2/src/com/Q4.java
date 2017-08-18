package com;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Q4 {

	public static void main(String[] args) {

		String month = "10";
		String day = "5";
		String year = "1983";

		LocalDate localDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		String s = dayOfWeek.name();

		System.out.println(s);

	}

}
