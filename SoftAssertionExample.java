package com.testng.training;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
	
	@Test
	public void testCaseOne(){
		SoftAssert softAssert = new SoftAssert();
		System.out.println("******Test case one started*******");
		softAssert.assertEquals(5,  5, "first hard assert Failed");
		System.out.println("hard assert success");
		softAssert.assertTrue("hello ".equals("hello"), "Second hard assert failed");
		System.out.println("*****Test case one executed successfully");
		softAssert.assertAll();
	}
	
	@Test
	public void testCaseTwo(){
		SoftAssert softAssert = new SoftAssert();
		System.out.println("******Test case two started******");
		softAssert.assertEquals("Hello", "Hello" ,  "first soft  assert Failed");
		System.out.println("hard assert success");
		softAssert.assertTrue(false, "Second soft assert failed");
		System.out.println("*****Test case two executed successfully");
		softAssert.assertAll();
		
	}
	
	@Test
	public void testCaseThree(){
		SoftAssert softAssert = new SoftAssert();
		System.out.println("******Test case three started*******");
		softAssert.assertEquals(5,  5, "first hard assert Failed");
		System.out.println("hard assert success");
		Assert.assertTrue("Hello".equals("Hello"), "Second hard assert failed");
		System.out.println("*****Test case three executed successfully");
		
	}



}
