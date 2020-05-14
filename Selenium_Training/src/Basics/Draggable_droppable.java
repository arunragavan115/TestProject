package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable_droppable {

	
	
	public static void main(String[] args) throws InterruptedException {      
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		

		Actions act = new Actions(driver);
		
		driver.navigate().to("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		act.dragAndDropBy(drag, 30, 40);
		System.out.println(drag.getAttribute("drag"));
		
		
		WebElement drop = driver.findElement(By.id("droppable"));
		System.out.println(drop.getLocation());

		
		act.dragAndDrop(drag, drop ).build().perform();
			 
		 
	
		
	}

}
