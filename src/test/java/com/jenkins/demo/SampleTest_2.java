package com.jenkins.demo;

import org.testng.annotations.Test;

public class SampleTest_2 {
	
	@Test(priority = 1)
	public void test_one()
	{
		System.out.println("test2_one");
	}
	
	@Test(priority = 2)
	public void test_two()
	{
		System.out.println("test2_two");
	}
	
	@Test(priority = 3)
	public void test_three()
	{
		System.out.println("test2_three");
	}

}