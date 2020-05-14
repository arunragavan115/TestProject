package Basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Olx_Assignment {

	public static void main(String[] args) throws InterruptedException, Exception  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	//	driver.get("https://www.olx.in/");
		driver.get("https://www.olxgroup.com/careers");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
//		
//		WebElement wb = driver.findElementByXPath("//*[@id=\'footer\']/div[1]/div/section[3]/ul/li[2]/a");
//		wb.click();
//		Thread.sleep(3000);
		
//		WebElement wb = driver.findElement(By.xpath("//a[contains(text(),'Careers')]"));
//		wb.click();
//		Thread.sleep(3000);
		
//		WebElement wb = driver.findElement(By.linkText("Careers"));
//		wb.click();
//		Thread.sleep(10000);
		
//		ArrayList tabs = new ArrayList(driver.getWindowHandles());
//		System.out.println(tabs.size());
		
//			WebElement wb = driver.findElementByXPath("//a[text()='Careers']");
//			wb.click();
		
		WebElement wb1 = driver.findElement(By.xpath("//div[text()=' Product Analyst ']"));
		wb1.click(); 
		
		
//		WebElement wb1 = driver.findElementByXPath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/section[4]/div[1]/div[1]/section[1]/div[1]/a[2]");
//		wb1.click();
		
		WebElement wb2 = driver.findElementByXPath("//*[@id=\'root\']/div/div[2]/section/section[3]/div/div/div/a/span");
		wb2.click();
		
		WebElement wb3 = driver.findElementByName("first_name");
		wb3.sendKeys("arun"+Keys.ENTER);
		
		WebElement wb4 = driver.findElementByName("last_name");
		wb4.sendKeys("ragavan"+Keys.ENTER);
		
		WebElement wb5 = driver.findElementByName("email");
		wb5.sendKeys("arunragavan96mail.com"+Keys.ENTER);
		
		WebElement wb6 = driver.findElementByName("phone");
		wb6.sendKeys("9944541345"+Keys.ENTER);
		
		WebElement wb7 = driver.findElementByName("question_17610518");
		wb7.sendKeys("arunlinkedin"+Keys.ENTER);
		
//		WebElement we = driver.findElementByXPath("//*[@type='file']");
//		we.click();
//		Thread.sleep(3000);
//		
//		StringSelection selection = new StringSelection("C:\\Users\\Arun Ragavan\\Desktop\\arun_Ragavan_Manual Testing.docx");
//		
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(3000);
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement wb8 = driver.findElementByName("question_17610519");
		wb8.sendKeys("mywebsite"+Keys.ENTER);
		
		WebElement wb9 = driver.findElementByName("question_17610520");
		wb9.sendKeys("by ad"+Keys.ENTER);
		
		WebElement lm = driver.findElementByXPath("//*[@id=\"agree\"]");
		lm.click();
		
		WebElement mm = driver.findElementByXPath("//*[@id=\"root\"]/div/div[2]/section/div/section/form/div[12]/button/span");
		mm.submit();
		driver.close();
	}

}
 