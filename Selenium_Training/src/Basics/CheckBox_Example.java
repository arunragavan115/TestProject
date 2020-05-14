package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stubo
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input")).click();

		WebElement select= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		System.out.println(select.isEnabled());

		WebElement Deselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		if(Deselect.isSelected()) {
			Deselect.click();
		}

		//		WebElement q=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		//		if(q.isSelected()) {
		//			q.click();
		//		}
		WebElement a=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
		a.click();

		WebElement b=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
		b.click();

		WebElement c=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
		c.click();

		WebElement d=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input")); 
		d.click();
	}
}
