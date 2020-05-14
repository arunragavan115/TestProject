package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement user=driver.findElement(By.id("email"));
		Actions builder =new Actions(driver);
	
	builder.moveToElement(user).click().keyDown(user,Keys.SHIFT).sendKeys(user,"hello").keyUp(user,Keys.SHIFT).doubleClick(user).contextClick().build().perform();

	}

}
