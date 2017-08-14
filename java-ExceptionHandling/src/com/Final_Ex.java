package com;

class AdultService {

	public String getService(int age) throws Exception {

		if (age > 18)
			return "Enjoy service";
		else
			throw new Exception();

	}

}

public class Final_Ex {

	public static void main(String[] args) {

		AdultService service = new AdultService();
		try {
			String s = service.getService(33);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
