package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_pushbutton_disabled2");
		
		driver.switchTo().frame(0);   // in webpage many frames are there so frame(0)
		
		WebElement ik=driver.findElement(By.id("myBtn"));   //before click is enabled
		System.out.println(ik.isEnabled());
		
		WebElement ii=driver.findElement(By.xpath("/html/body/button[2]")); // click try it
		ii.click();
		

		WebElement il=driver.findElement(By.id("myBtn")); //after click try it .is not enabled
		System.out.println(il.isEnabled());
		
		
		
	}

}
