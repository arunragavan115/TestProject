package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_Box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		WebElement alert_box =driver.findElement(By.xpath("/html/body/button"));
		alert_box.click();    //click the element
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); //switch to alertbox and then click ok
		
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		WebElement confirm_box=driver.findElement(By.xpath("/html/body/button"));
		confirm_box.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();	//switch to alertbox and then dismiss
		
		
	}

}
