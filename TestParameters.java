package com.testng.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestParameters {
	
	@Parameters("browser")
	@Test
	public void testCaseOne( String browser){
		System.out.println("Browser passed as : " + browser);
	}
	
	@Parameters({"Username" , "password"})
	@Test
	public void testCaseTwo(String Username , String password){
		System.out.println("Parameter for Username passed as : " + Username);
		System.out.println("Parameter for password passed as : " + password);
	}

}
