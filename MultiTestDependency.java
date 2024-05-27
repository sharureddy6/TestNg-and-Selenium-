package com.testng.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiTestDependency {
	
	@Test
	public void start(){
		System.out.println("starting the process");
	}
	
	@Test (dependsOnMethods = "start")
	public void initialize(){
		System.out.println("intialize the process");
	}
	
	@Test (dependsOnMethods = "initialize")
	public void process(){
		Assert.assertTrue(false);
		System.out.println(" running the process");
	}
	
	@Test (dependsOnMethods = {"process" , "initialize"} )
	public void stop(){
		System.out.println("stop the process");
	}

}
