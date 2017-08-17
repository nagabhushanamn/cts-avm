package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Handling_Ex1 {

	public static void main(String[] args) throws IOException {

		File file = new File("menu.txt");
		//
		// System.out.println(file.exists());
		// System.out.println(file.getName());
		// System.out.println(file.getAbsolutePath());
		// System.out.println(file.length());

		// -------------------------------------------

		// FileReader fr = new FileReader(file); // create stream

		// without buffer

		// int uc = 0;
		// while ((uc = fr.read()) != -1) {
		// System.out.print((char) uc);
		// }

		// with buffer ( recommended )

		// BufferedReader br = new BufferedReader(fr);
		// String line = null;
		// while ((line = br.readLine()) != null) {
		// System.out.println(line);
		// }
		//
		//
		//
		// fr.close();

		// ---------------------------------------------------

		// FileWriter fw = new FileWriter(file, true);
		// fw.write("\n 6.dosa");
		// fw.flush();
		// fw.write("\n 7.pizaa");
		// fw.close();

		// System.out.println("New Item added to file");

	}

}
