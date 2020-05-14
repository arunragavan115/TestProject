package Basics;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement dropdown1 = driver.findElementById("dropdown1");
		Select select = new Select(dropdown1);
		select.selectByIndex(2);
		select.selectByValue("3");
		select.selectByVisibleText("Selenium");
		
		List<WebElement> listofoptions = select.getOptions();
		int size = listofoptions.size();
		System.out.println("list of elements" + size);
		
		dropdown1.sendKeys("loadrunner");
		
		WebElement multiselect=driver.findElementByXPath("//*['@id=contentblock']/section/div[6]/select");
		
		Select multiselectbox=new Select(multiselect);
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(3);
		
	}

}
