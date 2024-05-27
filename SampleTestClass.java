package com.testng.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestClass {
	
	@Test
	public void testOne(){
		System.out.println("This is test one ");
	}
	
	@Test(dataProvider = "dataprovider")
	public void testGetdata(String s){
		System.out.println("Test getData method, input = " + s);
	}
	
	@DataProvider
	public Object[][] dataprovider(){
	    return new Object[][] {
	        {"A"},
	        {"B"}
	    };
	}
	
	@Test
	public void testThree(){
	     Assert.assertEquals(5, 1);
	}
	
	@Test
	public void testFour(){
		System.out.println("This is test four ");
		throw new SkipException(null);
	}

}
