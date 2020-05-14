package Selenium_Interview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class RefreshingWays {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver_exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("ragavan");
		
		//using refresh
	//	driver.navigate().refresh();   //v can refresh here only when v use  driver.navigate.to or else it wont work
		   
		driver.get(driver.getCurrentUrl());		// if v use driver.get ...v can refresh by this method and simple [more than enough]
		
		//using javascriptexcutor v can reload
//		JavascriptExecutor executor=(JavascriptExecutor) driver;
//		executor.executeScript("location.reload()");
		
		//using robot  v can refresh
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		
		robot.keyRelease(KeyEvent.VK_F5);
		
	}

}
