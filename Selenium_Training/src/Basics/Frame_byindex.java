package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_byindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_element_getattribute1");
			
		//frame by index
		driver.switchTo().frame("iframeResult"); // switching frame using id or name locators
		WebElement tryit=driver.findElement(By.xpath("/html/body/button"));
		tryit.click();	
		
		//frame by webelement
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/button")));  // switching frame using webelement
		
		
	}

}
