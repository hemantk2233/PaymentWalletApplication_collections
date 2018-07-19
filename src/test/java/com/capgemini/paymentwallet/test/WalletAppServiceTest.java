package com.capgemini.paymentwallet.test;

import com.capgemini.paymentwallet.bean.AccountDetails;
import com.capgemini.paymentwallet.service.WalletAppService;

import junit.framework.Assert;
import junit.framework.TestCase;

public class WalletAppServiceTest extends TestCase {
	
	AccountDetails w = new AccountDetails();
	WalletAppService service = new WalletAppService();
	
	
	
	public void testAddWalletDetails() {
		
		Assert.assertEquals(true, service.addWalletDetails(w));
	}
	
	
}
