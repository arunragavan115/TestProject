package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		
		
		String parentwindow = driver.getWindowHandle();
		WebElement kl=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/a"));
		kl.click();
		WebElement ko=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/a"));
		ko.click();
		WebElement kp=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/a"));
		kp.click();
		
		Set<String> allwindows = driver.getWindowHandles();
		for(String currentwindow: allwindows) {
			driver.switchTo().window(currentwindow);
			System.out.println(driver.getTitle( ) +" :" + currentwindow);
		}
	}

}
