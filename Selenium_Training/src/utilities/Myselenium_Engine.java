package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

	

public class Myselenium_Engine {
	static WebDriver driver;
	
	
	public void  launchChromebrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public void launchFirefoxbrowser() {
		 System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
				//Reusable method
	public void enterVal_id(String ele,String val) {
		driver.findElement(By.id(ele)).sendKeys(val);
	}
	
	public void enterVal_name(String ele,String val) {
		driver.findElement(By.name(ele)).sendKeys(val);
	}
	
	public void enterVal_classname(String ele,String val) {
		driver.findElement(By.className(ele)).sendKeys(val);
	}
	
	public void click_Id(String ele){
		driver.findElement(By.id(ele)).click();
	}
	
	public void click_name(String ele){
		driver.findElement(By.name(ele)).click();
	}
	public void click_classname(String ele){
		driver.findElement(By.className(ele)).click();
	}
	
	public void click_linktext(String ele){
		driver.findElement(By.linkText(ele)).click();
	}
	
	public void Dropdown_index_id(String ele,String index) {
		WebElement wb = driver.findElement(By.id(ele));
		Select dropdown = new Select(wb);
		 dropdown.selectByVisibleText(index);
	}
	
 public	 void launchurl(String name) {
		 driver.navigate().to(name);
	 }
 
 public	 void close() {
	 driver.quit();
 }
 

	
	}
