package com;

import java.io.Closeable;

/*
 *  resource
 *  ----------
 *  
 *  ==> a object who communicate with external world ( e.g DB connection, File,.....  )
 *  
 * 
 */

class Resource implements Closeable {

	public void init() {
		System.out.println("init....");
	}

	public void use() {
		System.out.println("use...");
		String s = "..";
		if (s == null)
			throw new NullPointerException();
	}

	public void close() {
		System.out.println("close...");
	}

}

public class Try_Catch_Finally {

	public static void main(String[] args) {

		Resource resource = new Resource();

		// try {
		// resource.init();
		// resource.use();
		// // resource.close();
		// } catch (Exception e) {
		// System.out.println("Ex-" + e.getMessage());
		// // resource.close();
		// // e.printStackTrace();
		// } finally {
		// resource.close();
		// }

		
		
		// JDK 1.7
		try (Resource resource2 = new Resource()) {
			resource2.init();
			resource2.use();
		} catch (Exception e) {
			System.out.println("Ex-" + e.getMessage());
		}

	}

}
