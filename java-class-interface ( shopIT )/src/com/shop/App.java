package com.shop;

import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;
import com.shop.pm.PriceMatrixImpl_v3;

public class App {

	public static void main(String[] args) {

		// init
		PriceMatrix priceMatrixV1 = new PriceMatrixImpl_v1();
		PriceMatrix priceMatrixV2 = new PriceMatrixImpl_v2();
		PriceMatrix priceMatrixV3 = new PriceMatrixImpl_v3();

		BillingImpl billComp = new BillingImpl(priceMatrixV3);
		// use
		String[] cart = { "34567", "87654", "67878" };
		double totalPrice = billComp.getTotalPrice(cart);
		System.out.println("Total : " + totalPrice);
		System.out.println("Happy shopping..");

	}

}
