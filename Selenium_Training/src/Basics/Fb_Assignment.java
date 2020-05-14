package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );

		//		//to click the forgetten account
		//		WebElement wb = driver.findElement(By.partialLinkText("account"));
		//		wb.click();

		WebElement wb1 = driver.findElement(By.id("u_0_m"));
		wb1.sendKeys("kishore"+Keys.ENTER);

		WebElement wb2 = driver.findElement(By.id("u_0_o"));
		wb2.sendKeys("kumar"+Keys.ENTER);

		WebElement wb3 = driver.findElement(By.id("u_0_r"));
		wb3.sendKeys("kish123@gmail.com"+Keys.ENTER);

		WebElement wb4 = driver.findElement(By.id("u_0_w"));
		wb4.sendKeys("kishore"+Keys.ENTER);

		WebElement wb5 = driver.findElement(By.id("u_0_u"));
		wb5.sendKeys("kish123@gmail.com"+Keys.TAB.TAB);

		WebElement ak = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select day = new Select(ak);
		day.selectByValue("20");

		WebElement ar = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(ar);
		month.selectByIndex(1);

		WebElement an = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(an);
		year.selectByVisibleText("1987");


		WebElement am = driver.findElement(By.xpath("//input[@value='2']"));
		am.click();

		WebElement wn = driver.findElement(By.xpath("//*[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
		wn.click();

		driver.close();

	}

}
