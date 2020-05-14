package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class fb_Action_background {

	public static void main(String[] args) throws InterruptedException {      
	
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.navigate().to("http://selenium.dev/");
		
		
		WebElement wb = driver.findElementByClassName("read-more");
		Actions act = new Actions(driver);
		System.out.println(wb.getCssValue("color"));
		act.moveToElement(wb).build().perform();
		
		
		
		System.out.println(wb.getCssValue("color"));
		act.moveToElement(wb).build().perform();
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
}

		
