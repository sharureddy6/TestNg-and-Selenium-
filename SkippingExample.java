package com.testng.training;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingExample {
	
	@Test
	public void testOne(){
		System.out.println(" this is test one ");
	}
	
	@Test (enabled = false)
	public void testTwo(){
		System.out.println(" this is test two ");
	}
	
	@Test
	public void testThree(){
		System.out.println(" this is test three ");
		
		throw new SkipException("Skipping to test tbis feature");
	}
	
	@Test
	public void testFour(){
		System.out.println(" this is test Four ");
	}

}
