package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Htmlunit_driver {

	public static void main(String[] args) throws InterruptedException {      

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//		Dimension d= new Dimension(300,500);
		//		Point p = new Point (299,200);



		//		driver.manage().window().maximize();
		//		driver.manage().window().setSize(d);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("http://fb.com/");
		Thread.sleep(2000);

		WebElement wb = driver.findElement(By.id("email"));
		wb.sendKeys("andwhsa@gmail.com");
		Thread.sleep(2000);

		WebElement wb1 = driver.findElement(By.id("pass"));
		wb1.sendKeys("jbcjsc ");
		Thread.sleep(2000);

		wb1 = driver.findElement(By.id("loginbutton"));
		wb1.click();
		Thread.sleep(2000);





		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());



		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());



		//		driver.quit();

	}

}


