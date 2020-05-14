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

public class fb_Action2 {

	public static void main(String[] args) throws InterruptedException {      
	
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.navigate().to("http://fb.com/");
		Thread.sleep(2000);
		
		WebElement wb=driver.findElement(By.name("email"));
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.SHIFT).build().perform();
		act.sendKeys("arun@gmail.com");
		act.keyUp(Keys.SHIFT).build().perform();
		act.sendKeys("kumar");
		
		
		 wb=driver.findElement(By.name("pass"));
		 wb.sendKeys("asfkb");
		 Thread.sleep(2000);
		 
		 wb=driver.findElement(By.className("uibutton"));
		 
		 wb.click();
		 Thread.sleep(2000);
		 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
}

		
