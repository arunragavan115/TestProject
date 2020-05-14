package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class fb_locator_tagname2 {

	public static void main(String[] args) throws InterruptedException {      
	
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.navigate().to("http://fb.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		
		
		
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
}

		
