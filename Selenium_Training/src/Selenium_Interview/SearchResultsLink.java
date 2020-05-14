package Selenium_Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResultsLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				// this program is print all the links in webpage
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver_exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
			driver.findElement(By.name("q")).sendKeys("19 crimes"+Keys.ENTER);
			Thread.sleep(3000);
			
//			List<WebElement> totallinks=driver.findElements(By.xpath("//a")); //stores the totalinks 
//			
//			//this will prints all the urls in the page
//			for(WebElement links : totallinks) { 
//				System.out.println(links.getAttribute("href"));
			
		List<WebElement> mainlinks=driver.findElements(By.xpath("//div[@id='search']//following::h3//following::div//cite")); //stores the totalinks 
		for(WebElement links : mainlinks) {
			System.out.println(links.getText());
	}
				
			
	}

}
