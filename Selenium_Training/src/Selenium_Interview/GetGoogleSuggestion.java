package Selenium_Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver_exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement games=driver.findElement(By.name("q"));
		games.sendKeys("games");
		Thread.sleep(3000);

		List<WebElement> searchsuggestion=driver.findElements(By.xpath("//ul[@role='listbox']")); // stores the searchsuggestion in elements 

		for(WebElement el:searchsuggestion) { 
			System.out.println(el.getText());

		}

	}

}
