package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("Https://www.gmail.com");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement username=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		username.sendKeys("arunragavan96@gmail.com"+Keys.ENTER);
		
		
		WebElement ps=driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		ps.sendKeys("Arun9944541345"+Keys.ENTER);
		driver.get(driver.getCurrentUrl());
		//.submit();
		
	}

}
