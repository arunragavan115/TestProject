package Basics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\SELENIUM DOWNLOADS\\\\chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement ele= driver.findElementByXPath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input");
		ele.sendKeys("ekfni"+Keys.ENTER);

	}

}
