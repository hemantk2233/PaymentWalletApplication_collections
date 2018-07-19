package com.capgemini.paymentwallet.test;

import com.capgemini.paymentwallet.bean.CustomerDetails;

import junit.framework.TestCase;

public class WalletAppDetailsTest extends TestCase {

	
	CustomerDetails c = new CustomerDetails();
	
	public void testGetAadharNo() {
	
		c.setAadharNo("123456789012");
		assertEquals("123456789012", c.getAadharNo());
	}

	public void testGetCustName() {
		
		c.setCustName("Hemant Kumar");
		assertEquals("Hemant Kumar", c.getCustName());
	}

	public void testGetAge() {
		
		c.setAge(15);
		assertEquals(15, c.getAge());
	}

	public void testGetGender() {
		
		c.setGender("Male");
		assertEquals("Male", c.getGender());
	}

	public void testGetCustMobileNo() {
		
		c.setCustMobileNo("9789268575");
		assertEquals("9789268575", c.getCustMobileNo());
	}

	public void testGetCustAddress() {
		
		c.setCustAddress("Hyderabad");
		assertEquals("Hyderabad", c.getCustAddress());
	}

	public void testGetCustEmail() {
		c.setCustEmail("hemantk2233@gmail.com");
		assertEquals("hemantk2233@gmail.com", c.getCustEmail());
	}

	public void testGetuName() {
		
		c.setuName("hemu2233");
		assertEquals("hemu2233", c.getuName());
	}

	public void testGetuPassword() {
		
		c.setuPassword("12345");
		assertEquals("12345", c.getuPassword());
	}

}
