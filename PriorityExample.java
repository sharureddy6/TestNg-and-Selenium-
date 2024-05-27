package com.testng.training;


import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test
	public void testOne(){
		System.out.println(" this is test one ");
	}
	
	@Test (priority = 1)
	public void testTwo(){
		System.out.println(" this is test two ");
	}
	
	@Test (priority = 2)
	public void testThree(){
		System.out.println(" this is test three ");			
	}
	
	@Test (priority = 3)
	public void testFour(){
		System.out.println(" this is test Four ");
	}

}