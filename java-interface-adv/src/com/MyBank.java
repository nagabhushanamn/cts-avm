package com;

/*
 *  overriding coding rules
 *  ------------------------
 *  
 *   must be same
 *   
 *   	-> method name
 *      -> order & number & type of args must be same
 *      -> return type
 *      
 *    may different
 *    
 *      -> access specofier
 *      
 *       condn :  should not method visibility
 * 
 * 
 */

// what
interface TxrService {
	public boolean txr(double amount, String fromAccNum, String toAccNum);

	default boolean newTxr() {
		return false;
	}
}

// How
class NEFTTxrService implements TxrService {

	public boolean txr(double amount, String fromAccNum, String toAccNum) {
		// ......
		return true;
	}
	
}

class IMPSTxrService implements TxrService {

	@Override
	public boolean txr(double amount, String fromAccNum, String toAccNum) {
		// ..
		return false;
	}

}

// ....

class BankTxrModule {

	public void doFundTxr(TxrService txrService) {
		txrService.txr(1000.00, "1", "2");
	}

}

public class MyBank {

	public static void main(String[] args) {

		BankTxrModule bankTxrMod = new BankTxrModule();
		bankTxrMod.doFundTxr(new NEFTTxrService());
		bankTxrMod.doFundTxr(new IMPSTxrService());

	}

}
