package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long StartTime;
	
	//Aim:open google chrome and go to
	//google.co.in 2 bing.com and 3 yahoo.com and then close a browser
	
	@BeforeSuite
	public void launchbrowser() {
		long StartTime=System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		 driver = new ChromeDriver();	
		}
	
	@Test
	public void opengoogle() {
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void openBing() {
		driver.get("https://www.bing.com/");
	}
	
	@Test
	public void openyahoo() {
		driver.get("https://www.yahoo.com/");	
	}
	
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		
		long EndTime=System.currentTimeMillis();
		long totalTime= EndTime-StartTime;
		System.out.println("Total time taken"+ totalTime);
			
	}
}



