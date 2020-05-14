package Advanced_Concepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldwindow=driver.getWindowHandle();				//stores oldwindow using getwindowhandle();
		
		WebElement homepage=driver.findElement(By.id("home"));
		homepage.click();
		
		Set<String>handles=driver.getWindowHandles(); //stores the all opened window using getwindowhandles();
		
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);  //controls the new window and switch the driver to newwindow
		}
			
		WebElement editbox=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		Thread.sleep(1000);
		
		driver.close();
			
		driver.switchTo().window(oldwindow);  // again driver goes to defaultwindow
		
		WebElement openmultiple=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		openmultiple.click();
		Thread.sleep(3000);
		
		int numberofwindows=driver.getWindowHandles().size();
		System.out.println("no of windows opened:"+ numberofwindows);  //count how many windows are opened
		
		WebElement closewindow=driver.findElement(By.id("color"));
		closewindow.click();
		
		Set<String>newwindowhandles=driver.getWindowHandles();
		
		for(String allwindows : newwindowhandles) {
		if(!allwindows.equals(oldwindow)) {
			driver.switchTo().window(allwindows);
			
			driver.close();
		}
		}
		driver.quit();
	}
	

}
