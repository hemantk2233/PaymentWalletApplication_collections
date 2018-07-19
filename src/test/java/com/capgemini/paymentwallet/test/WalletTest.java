package com.capgemini.paymentwallet.test;

import java.time.LocalDate;

import com.capgemini.paymentwallet.bean.CustomerDetails;
import com.capgemini.paymentwallet.bean.AccountDetails;

import junit.framework.TestCase;

public class WalletTest extends TestCase {
	
	AccountDetails w = new AccountDetails();
	public void testGetCustBal() {

		w.setCustBal(50000.0f);
		assertEquals(50000.0f, w.getCustBal());
	}

	public void testGetCustAccNo() {

		w.setCustAccNo(123456);
		assertEquals(123456, w.getCustAccNo());
	}

	public void testGetCustAccDate() {
		
		w.setCustAccDate(LocalDate.now());
		assertEquals(LocalDate.now(), w.getCustAccDate());
		
	}

	public void testGetCustomerDetails() {

		CustomerDetails c = new CustomerDetails();
		w.setCustomerDetails(c);
		assertEquals(c, w.getCustomerDetails());
	}

}
