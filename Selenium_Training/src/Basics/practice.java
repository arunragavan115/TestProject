package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.grabcery.com/");
		
		WebElement wb1 =driver.findElement(By.xpath("//button[@class='getstaeted_btn']"));
		wb1.click();
		
		WebElement wb2 = driver.findElement(By.xpath("//*[@id=\"locationForm\"]/section/div/div[4]/span/a"));
		wb2.click();
		
		WebElement wb3 = driver.findElement(By.xpath("//input[@id='loginNumber']"));
		wb3.sendKeys("9944541345"+Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement otp1 = driver.findElement(By.xpath("//*[@id=\"1\"]"));
		otp1.sendKeys("1"+Keys.TAB);
		
		WebElement otp2 = driver.findElement(By.xpath("//*[@id=\"2\"]"));
		otp2.sendKeys("2"+Keys.TAB);
		
		WebElement otp3 = driver.findElement(By.xpath("//*[@id=\"3\"]")); 
		otp3.sendKeys("3"+Keys.TAB);
		
		WebElement otp4 = driver.findElement(By.xpath("//*[@id=\"4\"]"));
		otp4.sendKeys("4"+Keys.ENTER);
		
		
	}

	
}
