package Selenium_Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver_exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		
		WebElement homepage=driver.findElement(By.id("home"));
		homepage.click();
		
		Thread.sleep(3000);
	//	driver.close();  // only focus driver window and clossesit  and did not [close user focus windows]
		driver.quit();  // quit all windows
		
	}

}
