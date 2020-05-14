package Selenium_Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver_exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth"); // admin://admin@ is v give the username and password in get
		
	//	driver.switchTo().alert().accept(); // v cannot use this for authentication popup[its not alert or prompt]
		
		// and v can handle authentication popup by sikuli,Autoit ,3rd party tools...but above method is enough
	}

}
