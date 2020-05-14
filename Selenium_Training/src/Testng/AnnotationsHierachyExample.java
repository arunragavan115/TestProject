package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsHierachyExample {
	@Test
	public void test() {
		System.out.println("i m test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("i m before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("i m after method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("i m before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("i m afterclass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("i m before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("i m after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("i m before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("i m after suite");
	}

}
