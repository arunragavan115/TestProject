package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc_Select {

	public static void main(String[] args) throws InterruptedException {      

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/nget/train-search");

		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		WebElement wan=driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[6]");
		wan.click();

		WebElement ab=driver.findElement(By.id("userName"));
		ab.sendKeys("muthuvel12312");

		WebElement rb=driver.findElement(By.id("usrPwd"));
		rb.sendKeys("Arunragavan99554");

		WebElement ty=driver.findElement(By.id("cnfUsrPwd"));
		ty.sendKeys("Arunragavan99554");

		WebElement drop=driver.findElement(By.xpath("//label[@class='ng-tns-c11-7 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']"));
		drop.click();
		Thread.sleep(3000);

		WebElement dropdown_list1=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[4]/div[2]/p-dropdown/div/div[4]/div/ul/li[1]/span"));
		dropdown_list1.click();

		WebElement wb1=driver.findElement(By.xpath("//input[@size='20']"));
		wb1.sendKeys("buffalo");

		WebElement lang=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[5]/div[2]/p-dropdown/div/label"));
		lang.click();

		WebElement dropdown_list2=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[5]/div[2]/p-dropdown/div/div[4]/div/ul/li[1]"));
		dropdown_list2.click();

		WebElement qk=driver.findElement(By.id("firstName"));
		qk.sendKeys("muthu"+Keys.TAB.TAB);

		WebElement gen=driver.findElement(By.id("M"));
		gen.click();

		WebElement cal=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[2]/p-calendar/span/input"));
		cal.sendKeys("03-03-2002"+Keys.ENTER);

		WebElement occ=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[4]/p-dropdown/div/label"));
		occ.click();

		WebElement stu=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[4]/p-dropdown/div/div[4]/div/ul/li[6]/span"));
		stu.click();

		WebElement mar=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[10]/div[2]/label[1]/input"));
		mar.click();

		WebElement coun=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[11]/div[2]/select"));

		Select dropdown=new Select(coun);
		dropdown.selectByVisibleText("India");


		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("hgfvbnmmj2@gmail.com");

		WebElement isi=driver.findElement(By.id("mobile"));
		isi.sendKeys("9944541345");

		WebElement nation=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[12]/div[5]/select"));
		Select dropdown3=new Select(nation);
		dropdown3.selectByVisibleText("India");

		WebElement add=driver.findElement(By.id("resAddress1"));
		add.sendKeys("99");

		WebElement str=driver.findElement(By.id("resAddress2"));
		str.sendKeys("river street");


		WebElement pin=driver.findElement(By.name("resPinCode"));
		pin.sendKeys("607308");

		WebElement state=driver.findElement(By.id("resState"));
		state.sendKeys("tamilnadu");

		WebElement city=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[16]/div[4]/select"));
		city.isSelected();

		WebElement phn=driver.findElement(By.id("resPhone"));
		phn.sendKeys("9944541345");

		WebElement rad=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[18]/div[2]/input"));
		rad.click();

		WebElement pls=driver.findElement(By.xpath("//*[@id=\"sbi\"]"));
		pls.submit();

		WebElement cap=driver.findElement(By.xpath("//div[@role='presentation']"));
		
		cap.click();

	}



}


