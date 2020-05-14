package Selenium_Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickGoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
 
		WebElement games=driver.findElement(By.name("q"));
		games.sendKeys("game of thrones");
		Thread.sleep(3000);

		List<WebElement> searchsuggestion=driver.findElements(By.xpath("//ul[@role='listbox']//following::li")); // stores the searchsuggestion in elements 

	//	int position=0;
		for(WebElement el:searchsuggestion) { 
			String text=el.getText();
			System.out.println(text);
	//		System.out.println(el.getText());
			
			if(text.contains("cast")) {   // this method is using for if search suggestion has contains cast means this will click cast
			el.click();
			break;
			}
//			position++;

		/*	if(position==3) {
				el.click();      this method is used for clicking 3rd search suggestion
				break; */
			}

		}

	}



