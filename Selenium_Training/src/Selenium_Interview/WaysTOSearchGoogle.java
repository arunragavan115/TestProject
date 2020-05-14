package Selenium_Interview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysTOSearchGoogle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver_exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement searchbox=driver.findElement(By.name("q"));
	//	searchbox.sendKeys("game of thrones"+Keys.ENTER);    //this is one method to enter
		searchbox.sendKeys("123\n");                         // when v give \n along with sendkeys it will enter
	//	searchbox.submit();   // v use to submit to enter
		
//		Robot robot =new Robot();                        //using robot v can enter
//		robot.keyPress(KeyEvent.VK_ENTER); 					//keypress to enter
//		robot.keyRelease(KeyEvent.VK_ENTER);				//keyrelease to release the enter
		
		
	
	
	
	}}
