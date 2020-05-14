package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Guru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/");
		
		WebElement w2 = driver.findElement(By.name("emailid"));
		w2.sendKeys("arunragavan96@outlook.com");
		
		
		WebElement w1 = driver.findElement(By.xpath("//input[@type='submit']"));
		w1.submit();
		
//		driver.close();
		

	}
}
