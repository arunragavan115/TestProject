package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_Select {

	public static void main(String[] args) throws InterruptedException {      
	
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://fb.com/");
		Thread.sleep(2000);
		
		WebElement wb=driver.findElementById("day");
		Select Dropdown= new Select(wb);
		Dropdown.selectByIndex(15);
		
		 wb=driver.findElementById("month");
		 Dropdown = new Select(wb);
		 Dropdown.selectByVisibleText("Feb");
		 
		 
		wb=driver.findElementByName("birthday_year");
		Dropdown = new Select(wb);
		 Dropdown.selectByValue("1996");
		// Dropdown.deselectByValue("1996");
		 
		 wb.click();
		 Thread.sleep(2000);
		
	}
}

		
