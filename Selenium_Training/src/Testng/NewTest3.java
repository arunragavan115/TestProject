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

public class NewTest3 {
  
	@Test
  public void add () {
	  System.out.println("adding client");
  }
  
  @Test
  			public void delete() {
	  		System.out.println("delete the client");
  }
  
  @BeforeMethod
  			public void beforeMethod() {
	  		System.out.println("login url");
  }

  @AfterMethod
  			public void afterMethod() {
	  		System.out.println("logout");
  }

  @BeforeClass
  		public void open() {
	  	System.out.println("open a browser"); 
  }

  @AfterClass
  			public void close() {
	  		System.out.println("close a browser");
  }

  @BeforeTest
  			public void name() {
	  		System.out.println("start the database connection");
  }

  @AfterTest
  			public void close1 () {
	  		System.out.println("close the database connection");
  }

  @BeforeSuite
  			public void beforeSuite() {
	  		System.out.println("create my test result");
  }

  @AfterSuite
  			public void afterSuite() {
	  		System.out.println("email my test case result");
  }


}
