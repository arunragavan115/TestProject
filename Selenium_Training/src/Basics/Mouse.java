package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.aseerium.com/");

		//	WebElement before_click=driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[1]/div/p"));

		WebElement after_click =driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul/li[7]/a/button"));

		System.out.println(after_click.getCssValue("color"));

		Actions builder =new Actions(driver);


		builder.moveToElement(after_click); //moving the cursor to target element and finds the color
		builder.build().perform();

 

		System.out.println(after_click.getCssValue("color")); // to getcolor of the element using cssvalue


	}

}
