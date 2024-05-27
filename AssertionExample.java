package com.testng.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	@Test
	public void testOne(){
		System.out.println("This is Test One");
		Assert.assertEquals("Facebook" , "Facebook");
	}
	
	@Test
	public void testTwo(){
		
		Assert.assertEquals(404 , 200);
		System.out.println("This is Test Two");
	}
	
	@Test
	public void testThree(){
		System.out.println("This is Test Three");
		Assert.assertTrue(true);
	}
	
	@Test
	public void testFour(){
		System.out.println("This is Test Four");
		Assert.assertTrue(false, "Making test as fail");
	}
	
	@Test
	public void testFive(){
		System.out.println("This is Test Five");
	}
	
	@Test
	public void testSix(){
		System.out.println("This is Test Six");
	}

}
