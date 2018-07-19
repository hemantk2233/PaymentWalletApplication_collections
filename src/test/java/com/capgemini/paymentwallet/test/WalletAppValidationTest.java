package com.capgemini.paymentwallet.test;

import com.capgemini.paymentwallet.service.WalletAppValidation;

import junit.framework.Assert;
import junit.framework.TestCase;

public class WalletAppValidationTest extends TestCase {

	WalletAppValidation validate = new WalletAppValidation();
	
	public void testValidateAadharNo() {
		
		Assert.assertEquals(true, validate.validateAadharNo("267617192989"));
		Assert.assertEquals(false, validate.validateAadharNo("12345"));
		
	}

	public void testValidateCustomerName() {
		
		Assert.assertEquals(true, validate.validateCustomerName("Hemant Kumar"));
		Assert.assertEquals(false, validate.validateCustomerName("hemantk2233"));
		
	}

	public void testValidateGender() {
		
		Assert.assertEquals(true, validate.validateGender("Male"));
		Assert.assertEquals(true, validate.validateGender("Female"));
		Assert.assertEquals(false, validate.validateGender("Hello"));
		
	}

	public void testValidateUserName() {
	
		Assert.assertEquals(true, validate.validateUserName("hemantk2233"));
		Assert.assertEquals(false, validate.validateUserName("hemant"));
		
		
	}

	public void testValidateMobileNo() {
		
		Assert.assertEquals(true, validate.validateMobileNo("9789268575"));
		Assert.assertEquals(false, validate.validateMobileNo("abc123"));
		
	}

	public void testValidateCustInitBal() {
		
		Assert.assertEquals(true , validate.validateCustInitBal(20000));
		Assert.assertEquals(false, validate.validateCustInitBal(500));
	
	}

	public void testValidateUserPassword() {
		
		Assert.assertEquals(true , validate.validateUserPassword("12345678"));
		Assert.assertEquals(false, validate.validateUserPassword("12345"));
	
	}

	public void testValidateEmailId() {
		
		Assert.assertEquals(true, validate.validateEmailId("hkumar22@capgemini.com"));
		Assert.assertEquals(false, validate.validateEmailId("abc"));
	
	}

}
