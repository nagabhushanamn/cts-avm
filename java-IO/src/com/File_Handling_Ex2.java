package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class File_Handling_Ex2 {

	public static void main(String[] args) throws IOException {

		// File file = new File("images/Laptop.png");
		// FileInputStream fis = new FileInputStream(file); // any-file
		// byte[] imgData = new byte[(int) file.length()];
		// fis.read(imgData);
		// fis.close();
		//
		// File outFile = new File("images/Laptop-new.png");
		// FileOutputStream fos = new FileOutputStream(outFile);
		// fos.write(imgData);
		// fos.close();
		//
		// System.out.println("Img backup taken");

		// File file = new File("menu.txt");
		// FileInputStream fis = new FileInputStream(file); // any-file
		// InputStreamReader isr = new InputStreamReader(fis);
		// BufferedReader br = new BufferedReader(isr);
		//
		// File outFile = new File("menu-new.txt");
		// FileOutputStream fos = new FileOutputStream(outFile);
		//
		// String line = null;
		// while ((line = br.readLine()) != null) {
		// fos.write(line.getBytes());
		// }
		//
		// br.close();
		// fos.close();
		//
		// System.out.println("Img backup taken");

		// -------------------------------------------------

		File file = new File("menu.txt");
		FileInputStream fis = new FileInputStream(file); // any-file
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		File outFile = new File("menu-new1.txt");
		PrintWriter pw = new PrintWriter(outFile);

		String line = null;
		while ((line = br.readLine()) != null) {
			pw.println(line);
		}

		br.close();
		pw.close();

	}

}
