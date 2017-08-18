package com;

public class Ex_3 {

	public static void main(String[] args) {

		class Local {
			int ins = 1;

			void insMethod() {
				System.out.println(ins);
			}
		}

		Local local = new Local();
		local.insMethod();

	}

}
