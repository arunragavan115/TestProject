package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/arun_ragavan/");
		
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/header/section/div[2]/span"));
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

	
}
