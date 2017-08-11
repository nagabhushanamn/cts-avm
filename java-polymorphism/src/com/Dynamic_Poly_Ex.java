package com;

interface Txr {
	void doTxr();
}

class NEFT implements Txr {
	@Override
	public void doTxr() {
		System.out.println("NEFT txr");
	}
}

class IMPS implements Txr {
	@Override
	public void doTxr() {
		System.out.println("IMPS");
	}
}

class Bank {
	public void doFundTxr(Txr txr) {
		txr.doTxr();
	}
}

public class Dynamic_Poly_Ex {

	public static void main(String[] args) {
		
		Bank bank=new Bank();
		bank.doFundTxr(new IMPS());
		bank.doFundTxr(new NEFT());

	}

}
