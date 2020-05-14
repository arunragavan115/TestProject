package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Actions action = new Actions(driver);
		
		WebElement element;
		element=driver.findElement(By.xpath("//*[@id=\"u_0_m\"]"));
		
		
		action.sendKeys("kumar").doubleClick(element).build().perform(); //to select kumar using doubleclick
		
		action.sendKeys("testisincaps").keyUp(Keys.SHIFT).build().perform();
		
		
	
	
	}
	
}
