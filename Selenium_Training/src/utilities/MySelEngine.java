package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelEngine {
	WebDriver driver;

	public void launchChromeBrowser() {

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void openurl(String url) {
		driver.get(url);
	}
	
	public void clickbyId(String element) {
		driver.findElement(By.id(element)).click();
	}

	public void clickbyXpath(String element) {
		driver.findElement(By.xpath(element)).click();
	}
	
	public void clickbyName(String element) {
		driver.findElement(By.name(element));
	}

	public void clickbyTagName(String element) {
		driver.findElement(By.tagName(element));
	}
	
	public void clickbyClassName(String element) {
		driver.findElement(By.className(element));
	}

	public void enterValuebyId(String element, String value) {
		driver.findElement(By.id(element)).sendKeys(value);
		
	}

}



