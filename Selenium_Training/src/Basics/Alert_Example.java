package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("http://www.leafground.com/pages/Alert.html");
			//using alertbox using accept
		WebElement alertbox=driver.findElementByXPath("//*[@id='contentblock']/section/div[1]/div/div/button");
		alertbox.click();
			
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		//using confirmbox by dismiss
		WebElement conformbox = driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div/div/button");
		conformbox.click();
			
		Alert conformbox1 = driver.switchTo().alert();
		Thread.sleep(3000);
		conformbox1.dismiss();
		
		WebElement promptbox = driver.findElementByXPath("//*[@id='contentblock']/section/div[3]/div/div/button");
		promptbox.click();		

		
		Alert promptbox1 = driver.switchTo().alert();
		Thread.sleep(3000);
		
		promptbox1.sendKeys("hlo i m ragavan");
		System.out.println(promptbox1.getText());
		promptbox1.accept();
	}

}
