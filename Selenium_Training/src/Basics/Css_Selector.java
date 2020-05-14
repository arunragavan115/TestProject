package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// using css locator 
		
		WebElement ak=driver.findElement(By.cssSelector("input[name='firstname']")); //using tag and attribute value
		ak.sendKeys("kkkkllllll");
		
		WebElement ak1=driver.findElement(By.cssSelector("._5iyx")); //using . method
		System.out.println(ak1.getText());
		
		WebElement ak2=driver.findElement(By.cssSelector("div[class='_5iyx']")); //using tagname and classname.
		System.out.println(ak2.getText());
		
		WebElement kuy=driver.findElement(By.cssSelector("#content > div > div > div > div > div.lfloat._ohe > div > img"));		
		System.out.println(kuy.getText());
		System.out.println(kuy.getAttribute("height"));
		
		WebElement starts=driver.findElement(By.cssSelector("div[class^='_5i']"));		//using css selector starts with ^
		System.out.println(starts.getText());
		
		WebElement ends=driver.findElement(By.cssSelector("div[class$='yx']"));		//using css selector ends with $
		System.out.println(ends.getText());
		
		WebElement kuy1=driver.findElement(By.cssSelector("div[class*='_5iy']"));		//using css selector contains *
		System.out.println(kuy1.getText());
		
		
		
		
		
	}

}
