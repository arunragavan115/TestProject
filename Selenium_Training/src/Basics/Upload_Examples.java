package Basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_Examples {

	public static void main(String[] args) throws AWTException, Exception {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"mydiv\"]/input"));
		uploadButton.click();
		
		//Windows filelocation - C:\Users\Arun Ragavan\Desktop\arun_Ragavan_Manual Testing.docx
		Thread.sleep(2000);
		StringSelection selection = new StringSelection("C:\\Users\\Arun Ragavan\\Desktop\\arun_Ragavan_Manual Testing.docx");
	
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
