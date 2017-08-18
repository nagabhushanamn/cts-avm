package com;

class Employee {
	public void doWork() {
		System.out.println("Emp working.....");
	}
}

public class Try_Catch_Ex {

	public static void main(String[] args) {
		System.out.println("A");
		try {

			System.out.println("B");
			int ari = 1 / 1;

			int[] nums = { 12, 34, 56 };
			System.out.println(nums[0]);

			Employee employee = null;
			employee.doWork();

			System.out.println("C");
		}
//		catch (ArithmeticException e) {
//			// handle
//			/*
//			 * --> report to end-user with friendly message 
//			 * --> log the exception , for future maintenance 
//			 * --> release any external resource ( rollback , close connection ) 
//			 * --> re-throw
//			 * 
//			 */
//			System.out.println("Ari Ex-" + e.getMessage());
//		} 
		
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Ex-" + e.getMessage());
		}
		// catch (NullPointerException e) {
		// System.out.println("NullPointer Ex-"+e.getMessage());
		// }
		catch (Exception e) {
			System.out.println("Ex-" + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("D");

	}

}
