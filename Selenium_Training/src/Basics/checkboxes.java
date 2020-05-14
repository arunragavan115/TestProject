package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {


	public static void main (String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Checkboxes")).click();

		WebElement checkboxes1=driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkboxes1.click();
		System.out.println(checkboxes1.isSelected());

		WebElement checkboxes2=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		checkboxes2.click();
		System.out.println(checkboxes2.isSelected());


	}

}
