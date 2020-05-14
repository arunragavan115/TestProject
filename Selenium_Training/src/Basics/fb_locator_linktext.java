package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class fb_locator_linktext {

	public static void main(String[] args) throws InterruptedException {      
	
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.navigate().to("http://fb.com/");
		Thread.sleep(2000);
		
		ChromeDriver wb = new ChromeDriver();
		wb.findElement(By.className("pass"));
		((WebElement) wb).sendKeys("gyghj");
		Thread.sleep(2000);
		
		
		wb.findElement(By.className("uibutton"));
		
		((WebElement) wb).click();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
}

		
		