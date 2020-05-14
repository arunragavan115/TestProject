package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class fb_locator_id {

	public static void main(String[] args) throws InterruptedException {      

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		//		ChromeDriver driver = new ChromeDriver();
		HtmlUnitDriver driver = new HtmlUnitDriver();
		Dimension d= new Dimension(300,500);
		Point p = new Point (299,200);



		//		driver.manage().window().maximize();
		//		driver.manage().window().setSize(d);

		//		System.out.println(driver.manage().window().getSize());
		//		System.out.println(driver.manage().window().getPosition());
		//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		driver.navigate().to("http://selenium.dev/");
		Thread.sleep(2000);
		driver.findElementByLinkText("Downloads").click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();;
		Thread.sleep(2000);
		driver.navigate().refresh();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());



		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());



		driver.close();

	}

}       			
