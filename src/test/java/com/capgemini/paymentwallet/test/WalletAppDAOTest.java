package com.capgemini.paymentwallet.test;

import com.capgemini.paymentwallet.bean.AccountDetails;
import com.capgemini.paymentwallet.dao.WalletAppDAO;

import junit.framework.Assert;
import junit.framework.TestCase;

public class WalletAppDAOTest extends TestCase {

	
	WalletAppDAO dao  = new WalletAppDAO();
	AccountDetails wallet = new AccountDetails();
	
	public void testAddWalletDetails() {
		
		Assert.assertEquals(true, dao.addWalletDetails(wallet));
		
	}

}
