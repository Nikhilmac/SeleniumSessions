package com.learn.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Login_three {
	@Test
	public void f() {

		System.out.println("Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");

	}

}
