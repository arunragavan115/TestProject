package Selenium_Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Selenium_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver_exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement snd=driver.findElement(By.name("q"));
		snd.sendKeys("selenium\n");

	//	List<WebElement> links = driver.findElements(By.xpath("//div[@id='search']//following::h3//following::div//cite")); //this will storestotal links in that page
		List<WebElement> links = driver.findElements(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/div/cite"));
		
		for(WebElement el : links) {
			System.out.println(el.getText());
		}
	}


}
