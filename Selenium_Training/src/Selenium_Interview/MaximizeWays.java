package Selenium_Interview;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver_exe");
		
		ChromeOptions chromeoption=new ChromeOptions(); 
		chromeoption.addArguments("start-maximized");  // usingchromeoption v can maximize
		WebDriver driver =new ChromeDriver(chromeoption);  // other 2 methods only open and then maximize the window but chromeoption maximixe  window when run 
	
		driver.get("https://www.google.com/");
		
		//driver.manage().window().maximize();  //maximixe window ..this method more than enough but for interview v have to tel all methods
		
		Dimension dimension =new Dimension(1366, 768); //using dimension in selenium (screensize) 
		driver.manage().window().setSize(dimension);		//set size by dimension
		
		
	}
	

}
