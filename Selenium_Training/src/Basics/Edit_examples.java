package Basics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		
		WebElement wb=driver.findElementById("email");
		 wb.sendKeys("arun ragavan");
		 
		// sendkeys to appendbox 
		WebElement appendbox=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input");
		appendbox.sendKeys("love");
		
		WebElement gettextbox=driver.findElementByName("username");
	//	String valueString= gettextbox.getAttribute("value"); 
		System.out.println(gettextbox.getAttribute("value"));  //getting text from the textbox using getattribute
		
		
		WebElement clearbox=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input");
		clearbox.clear();
		
		WebElement disabledbox=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input");
		boolean enabled=disabledbox.isEnabled();
		System.out.println(enabled);
		
	}
		
}
