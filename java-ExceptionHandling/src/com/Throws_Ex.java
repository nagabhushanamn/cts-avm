package com;

class AccountBalanceException extends Exception {

	private double balance;

	public AccountBalanceException(String message) {
		super(message);
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String getMessage() {
		return "No enough balance on your account , current balance : " + balance;
	}

}

class TxrService {
	public void doTxr(double amount, String fromAccNum, String toAccNum) throws AccountBalanceException {

		// Load FromAccount
		// load toAccount

		double fromAccBalance = 1000.00;
		if (fromAccBalance >= amount) {

			// debit
			// credit

			// update both accounts

			System.out.println("Txr success");

		} else {

			AccountBalanceException abe = new AccountBalanceException("No Enough Balance");
			abe.setBalance(fromAccBalance);
			
			throw abe;
		}

	}
}

// ------------------------------------------------------

class TicketBooking {

	public void bookFlightTicket() {

		//
		TxrService txrService = new TxrService();
		try {
			txrService.doTxr(5000.00, "9876543", "34567890");
			System.out.println("Ticket Booking Confirmed");
		} catch (AccountBalanceException e) {
			System.out.println("Ticket booing Failed");
			System.out.println(e.getMessage());
		}

	}

}

public class Throws_Ex {

	public static void main(String[] args) {

		TicketBooking booking = new TicketBooking();
		booking.bookFlightTicket();

	}

}
