package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_locator_xpath {

	public static void main(String[] args) throws InterruptedException {      
	
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.navigate().to("http://www.fb.com/");
		
		WebElement create=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div/div[1]/div[1]/span"));
		System.out.println(create.getText());
		
		WebElement fb=driver.findElement(By.xpath("//div[@class='_5iyx']"));
		System.out.println(fb.getText());
		
		// using Point to get location
		Point point=fb.getLocation();
		
		System.out.println(point);
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		//using Dimension to get size, height width
		Dimension dim=fb.getSize();
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		
		
		WebElement custom=driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
		custom.click();
		
		
		WebElement cv=driver.findElement(By.xpath("//*[@id=\"u_0_11\"]"));
		System.out.println(cv.isDisplayed()); //using that box is displayed or not in webpage 
		System.out.println(cv.isEnabled());   //using that box is enabled or not in webpage
		
		WebElement ty=driver.findElement(By.id("u_0_6")); 
		System.out.println(ty.isSelected()); 		//using that radio button is selected or not
		
		WebElement ik=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		
		Select day=new Select(ik);
		day.selectByIndex(12);
		
		WebElement io=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select month = new Select(io);
		month.selectByValue("5");
		
		WebElement iom=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select year = new Select(iom);
		year.selectByVisibleText("1996");
		
	}
}


