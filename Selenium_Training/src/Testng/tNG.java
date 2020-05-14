package Testng;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Basics.Log4j1;
import utilities.Log;
import utilities.MySelEngine;
import utilities.Myselenium_Engine;

public class tNG {
	Myselenium_Engine sel = new Myselenium_Engine();
	
	 Log log =new Log();
	
	
	@Test
	public void valid_login1(){
		
		log.info("launching browser");
		log.startTestCase("login_fb1");
	
		System.out.println("login_fb1");
		sel.enterVal_id("email", "arunragavan96@.com");
		sel.enterVal_id("pass", "arunragavan96@gamil.com");
		sel.click_Id("loginbutton");
		
		
		
		
		
		
	}
	@Test
	public void valid_login2(){
		log.info("launching browser");
		
		System.out.println("login_fb2");
		sel.enterVal_id("email", "arunragavan96@.com");
		sel.enterVal_id("pass", "arunragavan96@gamil.com");
		sel.click_Id("loginbutton");
		
		log.endTestCase("loginfb2");
		
		
	}
	
	
	 @BeforeMethod
		public void beforeMethod() {
		System.out.println("launch browser");
		sel.launchChromebrowser();
		sel.launchurl("http://www.fb.com");
}

@AfterMethod
	
		public void afterMethod() {
	
		System.out.println("logout browser");
		sel.close();
		
}

@BeforeClass
	public void beforeClass() {
//	System.out.println("@BeforeClass");
}

@AfterClass
		public void afterClass() {
	//	System.out.println("@AfterClass");
}

@BeforeTest
		public void beforeTest() {
	//	System.out.println("@BeforeTest");
}

@AfterTest
		public void afterTest() {
	//	System.out.println("@AfterTest");
}

@BeforeSuite
		public void beforeSuite() {
	//	System.out.println("@BeforeSuite");
}

@AfterSuite
		public void afterSuite() {
	//	System.out.println("@AfterSuite");
}
	}

		


	

