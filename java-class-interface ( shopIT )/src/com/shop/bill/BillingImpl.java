package com.shop.bill;

import com.shop.pm.PriceMatrix;

public class BillingImpl {

	private PriceMatrix priceMatrix;

	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	public double getTotalPrice(String[] cart) {
		double total = 0.0;
		for (int i = 0; i < cart.length; i++) {
			String item = cart[i];
			double price = priceMatrix.getPrice(item);
			total = total + price;
		}
		return total;
	}

}
