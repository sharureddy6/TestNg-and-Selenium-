package com.testng.training;

import org.testng.annotations.Test;

public class TestCaseGrouping {
	
	@Test(groups = "Regression")
	public void testCaseOne(){
		System.out.println("Test case one - Regression group");
	}
	
	@Test(groups = "Regression")
	public void testCaseTwo(){
		System.out.println("Test case two - Regression group");
	}
	
	@Test(groups = "Smoke Test")
	public void testCaseThree(){
		System.out.println("Test case three - Smoke Test group");
	}
	
	@Test(groups = {"Regression" , "Sanity"})
	public void testCaseFour(){
		System.out.println("Test case four - Regression and Sanity group");
	}

}
