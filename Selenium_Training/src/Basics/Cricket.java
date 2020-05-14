package Basics;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// stores mutliple elements using <WebElement>
		List<WebElement> Elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 
		 //looping  selecting one by one check box 
		for(WebElement el : Elements) {
		el.click();
		
		String value = el.getAttribute("value");
		System.out.println(value);
			}
		}

//		for(int i =0; i<Elements.size(); i++) {
//		
//			Elements.get(i).click();
		

}

