package Basics;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricket2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String beforexpath=   "//*[@id=\'checkbox" ;
		String afterxpath = "\'";

		for(int i =1 ; i<=3; i++)
		{
			String xpath=beforexpath+i+afterxpath;
			driver.findElement(By.xpath(xpath)).click();
		}
	}}