package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lenovo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lenovo.com/in/en/pc");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	

		WebElement monitor_before_click = driver.findElement(By.xpath("//*[@id=\"msaMasthead\"]/div[2]/div/div[2]/div/div[2]/div/ul/li[1]/div/div/ul/li[8]/a")); 
		monitor_before_click.click();

		WebElement WLED=driver.findElement(By.xpath("//*[@id=\"facetResults-grid\"]/div[1]/div[2]/a/span"));

		System.out.println(WLED.getText());
	}

}
